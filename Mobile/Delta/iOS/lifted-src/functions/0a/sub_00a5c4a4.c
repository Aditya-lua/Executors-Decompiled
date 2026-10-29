/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c4a4..0xa5c6f0 (588 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_c7c2eb;
extern char g_10002b0;

long long sub_a5c4a4(unsigned long a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7, unsigned long a8, long long a9, long long a10, long long a11)
{
    unsigned long v28;  // x24
    unsigned long long v29;  // 4108
    unsigned long long v30;  // 4108
    unsigned long v31;  // x22
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4105
    long long v34;  // x0
    unsigned long v35;  // x19
    unsigned long v37;  // x20
    uint128_t v0;  // [bp-0x1c8]
    uint128_t v1;  // [bp-0x1b8]
    unsigned long long v2;  // [bp-0x1a8]
    unsigned long v3;  // [bp-0x1a0]
    unsigned long v4;  // [bp-0x198]
    unsigned long v5;  // [bp-0x190]
    unsigned long v6;  // [bp-0x188]
    char v7;  // [bp-0x180]
    uint128_t v8;  // [bp-0x158]
    uint128_t v9;  // [bp-0x148]
    unsigned long long v10;  // [bp-0x138]
    uint128_t v11;  // [bp-0x130]
    uint128_t v12;  // [bp-0x120]
    unsigned long long v13;  // [bp-0x110]
    uint128_t v14;  // [bp-0x108]
    uint128_t v15;  // [bp-0xf8]
    unsigned long long v16;  // [bp-0xe8]
    uint128_t v17;  // [bp-0xe0]
    uint128_t v18;  // [bp-0xd0]
    unsigned long long v19;  // [bp-0xc0]
    uint128_t v20;  // [bp-0xb8]
    uint128_t v21;  // [bp-0xa8]
    unsigned long long v22;  // [bp-0x98]
    uint128_t v23;  // [bp-0x90]
    uint128_t v24;  // [bp-0x80]
    unsigned long long v25;  // [bp-0x70]
    unsigned long v26;  // [bp-0x68]
    char *v27;  // [bp-0x10]

    v27 = &a8;
    v26 = *(long long *)&g_10002b0;
    v5 = a5;
    v6 = a4;
    v3 = a7;
    v4 = a6;
    if ((a6 | a5) <= 0xffffffff)
    {
        if (!a0)
        {
            v28 = 0;
            v29 = arm64g_calculate_condition(4, a0, 0, 0);
            if (!(v29 & 1))
                goto LABEL_a5c4fe;
LABEL_a5c4fd:
            a0 = &g_c7c2eb;
        }
        else
        {
            v28 = a1;
            v30 = arm64g_calculate_condition(4, a0, 0, 0);
            if (v30 & 1)
                goto LABEL_a5c4fd;
LABEL_a5c4fe:
        }
        if (!a2)
        {
            v31 = 0;
            v32 = arm64g_calculate_condition(4, a2, 0, 0);
            if (!(v32 & 1))
                goto LABEL_a5c50a;
LABEL_a5c509:
            a2 = &g_c7c2eb;
        }
        else
        {
            v31 = a3;
            v33 = arm64g_calculate_condition(4, a2, 0, 0);
            if (v33 & 1)
                goto LABEL_a5c509;
LABEL_a5c50a:
        }
        if (!a7)
            v3 = 0x2000000;
        v34 = sub_a537e4(a10, "SCRYPT", a11);
        v35 = sub_a53488(v34, "SCRYPT", a11);
        sub_a53b90(v34);
        if (!v35)
            goto LABEL_a5c6b0;
        sub_a71670("pass", a0, v28);
        sub_a71670("salt", a2, v31);
        v8 = v0;
        v9 = v1;
        v10 = v2;
        sub_a70ed8("n", &v6);
        v11 = v0;
        v12 = v1;
        v13 = v2;
        sub_a70ed8("r", &v5);
        v14 = v0;
        v15 = v1;
        v16 = v2;
        sub_a70ed8(L"pg汴彳档潯敳獟杩污g䵈䍁吀卌䜭佒偕琀獬札潲灵渭浡e摡彤牰癯摩牥束潲灵s汴\u2d73牧畯⵰慮敭椭瑮牥慮l汴\u2d73牧畯⵰摩琀獬札潲灵愭杬琀獬札潲灵猭捥戭瑩s汴\u2d73牧畯⵰獩欭浥琀獬洭湩琭獬琀獬洭硡琭獬琀獬洭湩搭汴s汴\u2d73慭\u2d78瑤獬吀卌匭䝉䱁G汴\u2d73楳慧杬渭浡e摡彤牰癯摩牥獟杩污獧琀獬猭杩污ⵧ慩慮渭浡e汴\u2d73楳慧杬挭摯ⵥ潰湩t汴\u2d73楳慧杬猭捥戭瑩s汴\u2d73楳慧杬漭摩琀獬猭杩污ⵧ楳ⵧ慮敭琀獬猭杩污ⵧ楳ⵧ楯d汴\u2d73楳慧杬栭獡\u2d68慮敭琀獬猭杩污ⵧ慨桳漭摩琀獬猭杩污ⵧ敫瑹灹e汴\u2d73楳慧杬欭祥祴数漭摩琀灵敬损b楧彤扣䐀䐀䙅啁呌卟䥕䕔䉟㼀敳灣㔲父㨱猿捥㍰㐸ㅲ䜀㉃㘵A䍇㔲䈶䜀㉃㘵C䍇㔲䐶䜀㕃㈱A䍇ㄵ䈲䜀㕃㈱C捥獤彡敳灣㔲父弱桳㉡㘵䔀䑃䅓匫䅈㔲6捥獤彡敳灣㠳爴弱桳㍡㐸䔀䑃䅓匫䅈㠳4捥獤彡敳灣㈵爱弱桳㕡㈱䔀䑃䅓匫䅈ㄵ2摥㔲ㄵ9摥㐴8捥獤彡桳㉡㐲䔀䑃䅓匫䅈㈲4捥獤彡桳ㅡ䔀䑃䅓匫䅈1捥獤彡牢楡灮潯偬㔲父琱獬㌱獟慨㔲6捥獤彡牢楡灮潯偬㔲父弱桳㉡㘵攀摣慳扟慲湩潰汯㍐㐸ㅲ汴ㅳ弳桳㍡㐸攀摣慳扟慲湩潰汯㍐㐸ㅲ獟慨㠳4捥獤彡牢楡灮潯偬ㄵ爲琱獬㌱獟慨ㄵ2捥獤彡牢楡灮潯偬ㄵ爲弱桳㕡㈱爀慳灟獳牟慳彥桳㉡㘵倀卓匫䅈㔲6獲彡獰彳獲敡獟慨㠳4卐⭓䡓㍁㐸爀慳灟獳牟慳彥桳㕡㈱倀卓匫䅈ㄵ2獲彡獰彳", &v4);
        v17 = v0;
        v18 = v1;
        v19 = v2;
        v20 = v0;
        v21 = v1;
        v22 = v2;
        sub_a71bbc(sub_a70ed8("maxmem_bytes", &v3), &v3);
        v23 = v0;
        v24 = v1;
        v25 = v2;
        v37 = sub_a53798(v35, a8, a9, &v7) == 1;
        sub_a53588(v35);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/pbe_scrypt.c", 50, "EVP_PBE_scrypt_ex");
        sub_a36abc(6, 0xbb, 0);
LABEL_a5c6b0:
        v37 = 0;
    }
    if (*(long long *)&g_10002b0 == v26)
        return v37;
    ___stack_chk_fail();
}
