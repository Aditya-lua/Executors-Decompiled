/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb317e0..0xb31a70 (656 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b317e0_0 {
    struct st_b317e0_0 *field_0;
    unsigned int field_8;
    char padding_c[4];
    struct st_b317e0_0 *field_10;
    struct st_b317e0_0 *field_18;
} st_b317e0_0;

typedef struct st_b317e0_1 {
    char padding_0[16];
    struct st_b317e0_0 *field_10;
    struct st_b317e0_0 *field_18;
    struct st_b317e0_0 *field_20;
    struct st_b317e0_0 *field_28;
    struct st_b317e0_0 *field_30;
    struct st_b317e0_0 *field_38;
    struct st_b317e0_0 *field_40;
    struct st_b317e0_0 *field_48;
} st_b317e0_1;


double sub_b317e0(st_b317e0_1 *a0, st_b317e0_0 *a1)
{
    unsigned long long v10;  // x24
    unsigned long long v11;  // x23
    st_b317e0_0 **v20;  // x23
    st_b317e0_0 **v21;  // x23
    unsigned long v22;  // d0
    st_b317e0_0 *v23;  // x0
    unsigned long v24;  // d0
    st_b317e0_0 *v25;  // x0
    st_b317e0_0 *v26;  // x22
    st_b317e0_1 *v27;  // x21
    st_b317e0_0 **v28;  // x23
    st_b317e0_0 **v29;  // x23
    unsigned long long v12;  // x22
    unsigned long v30;  // d0
    st_b317e0_0 *v31;  // x0
    unsigned long v32;  // d0
    st_b317e0_0 *v33;  // x8
    uint128_t v34;  // q0
    unsigned long v36;  // d0
    unsigned long v37;  // d0
    unsigned long v38;  // d0
    st_b317e0_0 *v39;  // x8
    unsigned long long v13;  // x21
    unsigned long v40;  // d0
    unsigned long v41;  // d0
    st_b317e0_0 *v42;  // x8
    unsigned long v43;  // d0
    unsigned long v44;  // d0
    st_b317e0_0 *v45;  // x8
    unsigned long v46;  // d0
    unsigned long v47;  // d0
    st_b317e0_0 *v48;  // x0
    unsigned long v49;  // d0
    unsigned long long v14;  // x20
    unsigned long v50;  // d0
    unsigned long v51;  // d0
    unsigned long v52;  // d0
    unsigned long v53;  // d0
    unsigned long long v15;  // x19
    unsigned long long v16;  // x30
    st_b317e0_0 *v17;  // x0
    st_b317e0_0 *v18;  // x22
    st_b317e0_1 *v19;  // x21
    st_b317e0_0 *v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    unsigned long long v2;  // [bp-0x38]
    unsigned long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    unsigned long long v5;  // [bp-0x20]
    unsigned long long v6;  // [bp-0x18]
    char *v7;  // [bp-0x10]
    unsigned long long v8;  // [bp-0x8]
    char v9;  // [bp+0x0]

    if (!a1)
        return v53;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = &v9;
    v8 = v16;
    if (!a1->field_0)
        return v52;
    v17 = sub_a6fbc4(a1, "pass");
    if (v17)
    {
        v18 = v17;
        v19 = a0;
        v20 = &v19->field_10;
        v21 = v20 + 1;
        sub_a6c4e8(v19->field_10, v20[1], "providers/implementations/kdfs/scrypt.c", 148);
        *v21 = 0;
        *v20 = 0;
        if (!v18->field_18)
        {
            v23 = sub_a6bf4c(1, "providers/implementations/kdfs/scrypt.c", 0x99);
            *v20 = v23;
            if (!v23)
                return v24;
        }
        else if (v18->field_10 && !sub_a71440(v18, v20, 0, v21))
        {
            return v22;
        }
    }
    v25 = sub_a6fbc4(a1, "salt");
    if (v25)
    {
        v26 = v25;
        v27 = a0;
        v28 = &v27->field_20;
        v29 = v28 + 1;
        sub_a6c4e8(v27->field_20, v28[1], "providers/implementations/kdfs/scrypt.c", 148);
        *v29 = 0;
        *v28 = 0;
        if (!v26->field_18)
        {
            v31 = sub_a6bf4c(1, "providers/implementations/kdfs/scrypt.c", 0x99);
            *v28 = v31;
            if (!v31)
                return v32;
        }
        else if (v26->field_10 && !sub_a71440(v26, v28, 0, v29))
        {
            return v30;
        }
    }
    if (sub_a6fbc4(a1, "n"))
    {
        if (sub_a707f4())
        {
            v33 = v0;
            if (v33 < 2)
                return v37;
            v34 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Cnt8x16(__double_as_longlong(__longlong_as_double(v33))));
            if (1 < (unsigned int)__dirty_unsupported_Iop_ZeroHI112ofV128(_mm_add_epi16(_mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatOddLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpackhi_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))))), _mm_add_epi16(_mm_add_epi16(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatOddLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))))), _mm_add_epi16(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)), _mm_unpacklo_epi64(_mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8), _mm_srli_epi16(_mm_unpacklo_epi8(v34, v34), 8)))))))))
                return v36;
            a0->field_30 = v33;
        }
        else
        {
            return v38;
        }
    }
    if (sub_a6fbc4(a1, "r"))
    {
        if (sub_a707f4())
        {
            v39 = v0;
            if (!v39)
                return v40;
            a0->field_38 = v39;
        }
        else
        {
            return v41;
        }
    }
    if (sub_a6fbc4(a1, L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳"))
    {
        if (sub_a707f4())
        {
            v42 = v0;
            if (!v42)
                return v43;
            a0->field_40 = v42;
        }
        else
        {
            return v44;
        }
    }
    if (sub_a6fbc4(a1, "maxmem_bytes"))
    {
        if (sub_a707f4())
        {
            v45 = v0;
            if (!v45)
                return v46;
            a0->field_48 = v45;
        }
        else
        {
            return v47;
        }
    }
    v48 = sub_a6fbc4(a1, "properties");
    if (v48)
    {
        if (v48->field_8 != 4)
        {
            return v51;
        }
        else if (!sub_b31dec(a0, v48->field_10))
        {
            return v50;
        }
        else if (!sub_b31ab0(a0))
        {
            return v49;
        }
    }
    return v52;
}
