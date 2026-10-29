/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x976730..0x976d18 (1512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_976730_1 {
    struct st_976730_2 *field_0;
    char padding_8[216];
    char field_e0;
    char padding_e1[7];
    char field_e8;
    char padding_e9[7];
    char field_f0;
    char padding_f1[31];
    char field_110;
    char padding_111[95];
    char field_170;
    char padding_171[95];
    char field_1d0;
    char padding_1d1[95];
    char field_230;
    char padding_231[95];
    char field_290;
    char padding_291[95];
    char field_2f0;
    char padding_2f1[239];
    char field_3e0;
    char padding_3e1[47];
    struct st_976730_2 *field_410;
    char padding_418[8];
    char field_420;
    char padding_421[87];
    char field_478;
    char padding_479[143];
    unsigned long long field_508;
    uint128_t field_510;
    char padding_520[96];
    unsigned long long field_580;
    char padding_588[112];
    unsigned long long field_5f8;
    char padding_600[32];
    unsigned long long field_620;
    char field_623;
} st_976730_1;

typedef struct st_976730_0 {
    unsigned long long field_0;
} st_976730_0;

typedef struct st_976730_2 {
    struct st_976730_0 *field_0;
} st_976730_2;

extern long long g_978464;
extern unsigned long long g_979bf8;
extern st_976730_0 *g_e88260;
extern long long g_f00000;
extern char g_10002b0;

char sub_976730(st_976730_1 *a0)
{
    unsigned int v41;  // w0
    char v42;  // x0
    char v43;  // x0
    char v44;  // x0
    char v0;  // [bp-0x2a0]
    char v1;  // [bp-0x290]
    char v2;  // [bp-0x280]
    char v3;  // [bp-0x270]
    char v4;  // [bp-0x260]
    char v5;  // [bp-0x250]
    char v6;  // [bp-0x240]
    char v7;  // [bp-0x230]
    char v8;  // [bp-0x220]
    char v9;  // [bp-0x210]
    char v10;  // [bp-0x200]
    char v11;  // [bp-0x1f0]
    char v12;  // [bp-0x1e0]
    char v13;  // [bp-0x1d0], Other Possible Types: unsigned long
    char v14;  // [bp-0x1c0]
    unsigned long v15;  // [bp-0x1b8]
    char v16;  // [bp-0x1b0], Other Possible Types: unsigned long long
    st_976730_1 *v17;  // [bp-0x1a8]
    char v18;  // [bp-0x1a0]
    char v19;  // [bp-0x190]
    char v20;  // [bp-0x180]
    char v21;  // [bp-0x170]
    char v22;  // [bp-0x160]
    char v23;  // [bp-0x150]
    char v24;  // [bp-0x140]
    char v25;  // [bp-0x130]
    char v26;  // [bp-0x120]
    char v27;  // [bp-0x110]
    char v28;  // [bp-0x100]
    char v29;  // [bp-0xf0]
    char v30;  // [bp-0xe0]
    char v31;  // [bp-0xd0]
    char v32;  // [bp-0xc0]
    char v33;  // [bp-0xb0]
    char v34;  // [bp-0xa0]
    char v35;  // [bp-0x90]
    char v36;  // [bp-0x80]
    char v37;  // [bp-0x70]
    unsigned long v38;  // [bp-0x68]
    char *v39;  // [bp-0x10]
    char v40;  // [bp+0x0]

    v39 = &v40;
    v38 = *(long long *)&g_10002b0;
    v37 = 0;
    v35 = 0;
    v36 = 0;
    v33 = 0;
    v34 = 0;
    v31 = 0;
    v32 = 0;
    v29 = 0;
    v30 = 0;
    v27 = 0;
    v28 = 0;
    v25 = 0;
    v26 = 0;
    v23 = 0;
    v24 = 0;
    v21 = 0;
    v22 = 0;
    v19 = 0;
    v20 = 0;
    v16 = 0;
    v18 = 0;
    v13 = 0;
    v14 = 0;
    v12 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    if (a0->field_0 && *(long long *)&a0->padding_8[48] && *(long long *)&a0->padding_8[56])
    {
        sub_981240();
        v41 = sub_981248(a0->field_0);
        if ((char)(*((char *)&a0->field_620 + 3)) >> 1 & 1 || sub_98e30c(*(long long *)*(long long *)a0->field_0, v41, &a0->field_478))
        {
            v16 = &g_979bf8;
            v17 = a0;
            v13 = *(long long *)*(long long *)a0->field_0;
            v15 = 1200;
            a0->field_580 = 1200;
            a0->field_5f8 = 0xffffffffffffffff;
            v42 = sub_985260(&v13);
            *(unsigned long long *)&a0->field_420 = v42;
            if (v42)
            {
                v43 = sub_98e004();
                *(unsigned long long *)&a0->field_e0 = v43;
                if (v43)
                {
                    v44 = sub_976004();
                    *(unsigned long long *)&a0->field_e8 = v44;
                    if (v44 && sub_97ba4c(&a0->field_f0, 0))
                    {
                        a0->field_508 = 0x80000;
                        a0->field_510 = CONCAT(0x80000, 0x80000);
                        if (sub_97bb34(&a0->field_110, 0, "b", &g_f00000, &g_978464, a0) && sub_97bb70(&a0->field_170, 0x4000, &g_978464, a0) && sub_97bb70(&a0->field_1d0, 0x4000, &g_978464, a0) && sub_97bb70(&a0->field_230, 0x4000, &g_978464, a0) && sub_97bb70(&a0->field_290, 100, &g_978464, a0) && sub_97bb70(&a0->field_2f0, 100, &g_978464, a0) && sub_989208(&a0->field_3e0))
                        {
                            a0->field_620 = a0->field_620 | 0x1000;
                            a0->field_410 = &g_e88260;
                            g_e88260();
                        }
                    }
                }
            }
        }
    }
    sub_976fdc(a0);
    if (*(long long *)&g_10002b0 == v38)
        return 0;
    ___stack_chk_fail();
}
