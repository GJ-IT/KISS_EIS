package th.ac.kmutt.chart.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import th.ac.kmutt.chart.domain.ChartEntity;
import th.ac.kmutt.chart.domain.ChartFeatureEntity;
import th.ac.kmutt.chart.domain.ChartFeatureInstanceEntity;
import th.ac.kmutt.chart.domain.ChartFeatureMappingEntity;
import th.ac.kmutt.chart.domain.ChartFeatureMappingEntityPK;
import th.ac.kmutt.chart.domain.ChartFilterInstanceEntity;
import th.ac.kmutt.chart.domain.ChartInstanceEntity;
import th.ac.kmutt.chart.domain.CommentEntity;
import th.ac.kmutt.chart.domain.CopyrightServiceEntity;
import th.ac.kmutt.chart.domain.CopyrightServiceEntityPK;
import th.ac.kmutt.chart.domain.FeatureEntity;
import th.ac.kmutt.chart.domain.FilterEntity;
import th.ac.kmutt.chart.domain.FilterInstanceEntity;
import th.ac.kmutt.chart.domain.FundingResourceServiceEntity;
import th.ac.kmutt.chart.domain.FundingResourceServiceEntityPK;
import th.ac.kmutt.chart.domain.JournalPapersServiceEntity;
import th.ac.kmutt.chart.domain.JournalPapersServiceEntityPK;
import th.ac.kmutt.chart.domain.ServiceChartMappingEntity;
import th.ac.kmutt.chart.domain.ServiceChartMappingEntityPK;
import th.ac.kmutt.chart.domain.ServiceEntity;
import th.ac.kmutt.chart.domain.ServiceFilterMappingEntity;
import th.ac.kmutt.chart.domain.ServiceFilterMappingEntityPK;
import th.ac.kmutt.chart.model.ChartM;
import th.ac.kmutt.chart.model.CopyrightServiceM;
import th.ac.kmutt.chart.model.InBoundOutBoundServiceM;

public interface ChartService {
    public List aew()throws DataAccessException;
    public List listChart() throws DataAccessException;
    public List listCopyrightServiceEntity(th.ac.kmutt.chart.model.CopyrightServiceM param)throws DataAccessException;
    public List listJournalPapersServiceEntity(th.ac.kmutt.chart.model.JournalPapersServiceM param)throws DataAccessException;
    public List listFundingResourceServiceEntity(th.ac.kmutt.chart.model.FundingResourceServiceM param)throws DataAccessException;
    public Integer saveCopyrightServiceEntity(CopyrightServiceM model)
            throws DataAccessException ;

    //CHART
    public Integer saveChartEntity(ChartEntity transientInstance) throws DataAccessException;
    public Integer updateChartEntity(ChartEntity transientInstance) throws DataAccessException;
    public Integer deleteChartEntity(ChartEntity persistentInstance) throws DataAccessException;
    public ChartEntity findChartEntityById(Integer chartId) throws DataAccessException;
    public List listChartEntity(ChartM param)throws DataAccessException;
    //CHART_FEATURE
    public Integer saveChartFeatureEntity(ChartFeatureEntity transientInstance) throws DataAccessException;
    public Integer updateChartFeatureEntity(ChartFeatureEntity transientInstance) throws DataAccessException;
    public Integer deleteChartFeatureEntity(ChartFeatureEntity persistentInstance) throws DataAccessException;
    public ChartFeatureEntity findChartFeatureEntityById(Integer chartId) throws DataAccessException;

    //CHART_FEATURE_INSTANCE
    public Integer saveChartFeatureInstanceEntity(ChartFeatureInstanceEntity transientInstance) throws DataAccessException;
    public Integer updateChartFeatureInstanceEntity(ChartFeatureInstanceEntity transientInstance) throws DataAccessException;
    public Integer deleteChartFeatureInstanceEntity(ChartFeatureInstanceEntity persistentInstance) throws DataAccessException;
    public ChartFeatureInstanceEntity findChartFeatureInstanceEntityById(String instanceId) throws DataAccessException;

    //CHART_FEATURE_MAPPIG
    public Integer saveChartFeatureMappingEntity(ChartFeatureMappingEntity transientInstance) throws DataAccessException;
    public Integer updateChartFeatureMappingEntity(ChartFeatureMappingEntity transientInstance) throws DataAccessException;
    public Integer deleteChartFeatureMappingEntity(ChartFeatureMappingEntity persistentInstance) throws DataAccessException;
    public ChartFeatureMappingEntity findChartFeatureMappingEntityById(ChartFeatureMappingEntityPK id) throws DataAccessException;

    //CHART_FILTER_INSTANCE
    public Integer saveChartFilterInstanceEntity(ChartFilterInstanceEntity transientInstance) throws DataAccessException;
    public Integer updateChartFilterInstanceEntity(ChartFilterInstanceEntity transientInstance) throws DataAccessException;
    public Integer deleteChartFilterInstanceEntity(ChartFilterInstanceEntity persistentInstance) throws DataAccessException;
    public ChartFilterInstanceEntity findChartFilterInstanceEntityById(String instanceId) throws DataAccessException;
    public List listChartFilterInstanceEntity(th.ac.kmutt.chart.model.ChartFilterInstanceM param)throws DataAccessException;

    //CHART_INSTANCE
    public Integer saveChartInstanceEntity(ChartInstanceEntity transientInstance) throws DataAccessException;
    public Integer updateChartInstanceEntity(ChartInstanceEntity transientInstance) throws DataAccessException;
    public Integer deleteChartInstanceEntity(ChartInstanceEntity persistentInstance) throws DataAccessException;
    public ChartInstanceEntity findChartInstanceEntityById(String instanceId) throws DataAccessException;



    //COMMENT
    public Integer saveCommentEntity(CommentEntity transientInstance) throws DataAccessException;
    public Integer updateCommentEntity(CommentEntity transientInstance) throws DataAccessException;
    public Integer deleteCommentEntity(CommentEntity persistentInstance) throws DataAccessException;
    public CommentEntity findCommentEntityById(String instanceId) throws DataAccessException;

    //COPYRIGHT_SERVICE
    public Integer saveCopyrightServiceEntity(CopyrightServiceEntity transientInstance) throws DataAccessException;
    public Integer updateCopyrightServiceEntity(CopyrightServiceEntity transientInstance) throws DataAccessException;
    public Integer deleteCopyrightServiceEntity(CopyrightServiceEntity persistentInstance) throws DataAccessException;
    public CopyrightServiceEntity findCopyrightServiceEntityById(CopyrightServiceEntityPK id) throws DataAccessException;

    //FEATURE
    public Integer saveFeatureEntity(FeatureEntity transientInstance) throws DataAccessException;
    public Integer updateFeatureEntity(FeatureEntity transientInstance) throws DataAccessException;
    public Integer deleteFeatureEntity(FeatureEntity persistentInstance) throws DataAccessException;
    public FeatureEntity findFeatureEntityById(Integer featureId) throws DataAccessException;

    //FILTER
    public Integer saveFilterEntity(FilterEntity transientInstance) throws DataAccessException;
    public Integer updateFilterEntity(FilterEntity transientInstance) throws DataAccessException;
    public Integer deleteFilterEntity(FilterEntity persistentInstance) throws DataAccessException;
    public FilterEntity findFilterEntityById(Integer filterId) throws DataAccessException;
    public List listFilterEntity(th.ac.kmutt.chart.model.FilterM param)throws DataAccessException;


    //FILTER_INSTANCE
    public Integer saveFilterInstanceEntity(FilterInstanceEntity transientInstance) throws DataAccessException;
    public Integer updateFilterInstanceEntity(FilterInstanceEntity transientInstance) throws DataAccessException;
    public Integer deleteFilterInstanceEntity(FilterInstanceEntity persistentInstance) throws DataAccessException;
    public FilterInstanceEntity findFilterInstanceEntityById(String instanceId) throws DataAccessException;
    public List listFilterInstanceEntity(th.ac.kmutt.chart.model.FilterInstanceM param)throws DataAccessException;

    //FUNDING_RESOURCE_SERVICE
    public Integer saveFundingResourceServiceEntity(FundingResourceServiceEntity transientInstance) throws DataAccessException;
    public Integer updateFundingResourceServiceEntity(FundingResourceServiceEntity transientInstance) throws DataAccessException;
    public Integer deleteFundingResourceServiceEntity(FundingResourceServiceEntity persistentInstance) throws DataAccessException;
    public FundingResourceServiceEntity findFundingResourceServiceEntityById(FundingResourceServiceEntityPK id) throws DataAccessException;

    //JOURNAL_PAPERS_SERVICE
    public Integer saveJournalPapersServiceEntity(JournalPapersServiceEntity transientInstance) throws DataAccessException;
    public Integer updateJournalPapersServiceEntity(JournalPapersServiceEntity transientInstance) throws DataAccessException;
    public Integer deleteJournalPapersServiceEntity(JournalPapersServiceEntity persistentInstance) throws DataAccessException;
    public JournalPapersServiceEntity findJournalPapersServiceEntityById(JournalPapersServiceEntityPK id) throws DataAccessException;

    //SERVICE_CHART_MAPPING
    public Integer saveServiceChartMappingEntity(ServiceChartMappingEntity transientInstance) throws DataAccessException;
    public Integer updateServiceChartMappingEntity(ServiceChartMappingEntity transientInstance) throws DataAccessException;
    public Integer deleteServiceChartMappingEntity(ServiceChartMappingEntity persistentInstance) throws DataAccessException;
    public ServiceChartMappingEntity findServiceChartMappingEntityById(ServiceChartMappingEntityPK id) throws DataAccessException;

    //SERVICE
    public Integer saveServiceEntity(ServiceEntity transientInstance) throws DataAccessException;
    public Integer updateServiceEntity(ServiceEntity transientInstance) throws DataAccessException;
    public Integer deleteServiceEntity(ServiceEntity persistentInstance) throws DataAccessException;
    public ServiceEntity findServiceEntityById(Integer serviceId) throws DataAccessException;
    public List listServiceEntity(th.ac.kmutt.chart.model.ServiceM param)throws DataAccessException;

    //SERVICE
    public Integer saveServiceFilterMappingEntity(ServiceFilterMappingEntity transientInstance) throws DataAccessException;
    public Integer updateServiceFilterMappingEntity(ServiceFilterMappingEntity transientInstance) throws DataAccessException;
    public Integer deleteServiceFilterMappingEntity(ServiceFilterMappingEntity persistentInstance) throws DataAccessException;
    public ServiceFilterMappingEntity findServiceFilterMappingEntityById(ServiceFilterMappingEntityPK id) throws DataAccessException;

    public List listServiceFilterMappingEntity(th.ac.kmutt.chart.model.ServiceFilterMappingM param)throws DataAccessException;

    
    /*INBOUND_OUTBOUND_STUDENT*/
    public List InternationalCompareAllStudent(InBoundOutBoundServiceM transientInstance);
    public List EmpInternationalCompareAllEmp(InBoundOutBoundServiceM transientInstance);
    public List InternationalCompareAllStudentProgramInter(InBoundOutBoundServiceM transientInstance);
    public List ProgramInternationalCompareAllProgram(InBoundOutBoundServiceM transientInstance);
    public List InternationalCompareAllStudentByFaculty(InBoundOutBoundServiceM transientInstance);
    public List InternationalCompareAllEmpByFaculty(InBoundOutBoundServiceM transientInstance);
}
