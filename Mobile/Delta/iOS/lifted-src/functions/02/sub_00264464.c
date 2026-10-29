/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x264464..0x2646f8 (660 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_264464_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_264464_1;

typedef struct st_264464_0 {
    char field_0;
} st_264464_0;

extern long long g_f11980;

int sub_264464(unsigned int a0, void* *a1, unsigned int a2, unsigned long long a3)
{
    void* v8;  // x22
    unsigned long v9;  // x21
    uint128_t v18;  // q1
    uint128_t v19;  // q1
    uint128_t v20;  // q1
    uint128_t v21;  // q1
    uint128_t v22;  // q1
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    uint128_t v25;  // q1
    uint128_t v26;  // q1
    uint128_t v27;  // q1
    void* v10;  // x20
    uint128_t v28;  // q1
    uint128_t v29;  // q1
    uint128_t v30;  // q1
    uint128_t v31;  // q1
    uint128_t v32;  // q1
    unsigned int v33;  // w0
    void* v34;  // x22
    long long j;  // x8
    uint128_t v36;  // q1
    uint128_t v37;  // q1
    long long i;  // x8
    uint128_t v38;  // q1
    uint128_t v39;  // q1
    uint128_t v40;  // q1
    uint128_t v41;  // q1
    uint128_t v42;  // q1
    uint128_t v43;  // q1
    uint128_t v44;  // q1
    uint128_t v45;  // q1
    uint128_t v46;  // q1
    uint128_t v47;  // q1
    uint128_t v12;  // q1
    uint128_t v48;  // q1
    uint128_t v49;  // q1
    uint128_t v50;  // q1
    uint128_t v51;  // q1
    uint128_t v52;  // q1
    uint128_t v53;  // q1
    uint128_t v54;  // q1
    uint128_t v55;  // q1
    uint128_t v56;  // q1
    st_264464_1 *v57;  // x0
    uint128_t v13;  // q1
    unsigned int v58;  // w0
    unsigned int v59;  // w0
    uint128_t v14;  // q1
    uint128_t v15;  // q1
    uint128_t v16;  // q1
    uint128_t v17;  // q1
    st_264464_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_264464_0 *v1;  // [bp-0x70]
    st_264464_0 **v2;  // [bp-0x68], Other Possible Types: char
    st_264464_0 *v3;  // [bp-0x60]
    void* *v4;  // [bp-0x40]
    st_264464_1 *v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    if (a3 != 12514061731995212051)
        return v59;
    v3 = &v2;
    v2 = &v3;
    if (a2 == 3)
    {
        v34 = *a1;
        v9 = (long long)v34[16];
        v10 = operatornew(672);
        _bzero(v10, 672);
        if (31 >= v10 - v34)
        {
            j = 0;
            do
            {
                *((char *)v10 + j) = *((char *)v34 + j);
                j += 1;
            } while (j != 672);
        }
        else
        {
            v36 = (int128_t)v34[16];
            *(int128_t *)v10 = *(int128_t *)v34;
            *(uint128_t *)&v10[16] = v36;
            v37 = (int128_t)v34[48];
            *(int128_t *)&v10[32] = (int128_t)v34[32];
            *(uint128_t *)&v10[48] = v37;
            v38 = (int128_t)v34[80];
            *(int128_t *)&v10[64] = (int128_t)v34[64];
            *(uint128_t *)&v10[80] = v38;
            v39 = (int128_t)v34[112];
            *(int128_t *)&v10[96] = (int128_t)v34[96];
            *(uint128_t *)&v10[112] = v39;
            v40 = (int128_t)v34[144];
            *(int128_t *)&v10[128] = (int128_t)v34[128];
            *(uint128_t *)&v10[144] = v40;
            v41 = (int128_t)v34[176];
            *(int128_t *)&v10[160] = (int128_t)v34[160];
            *(uint128_t *)&v10[176] = v41;
            v42 = (int128_t)v34[208];
            *(int128_t *)&v10[192] = (int128_t)v34[192];
            *(uint128_t *)&v10[208] = v42;
            v43 = (int128_t)v34[240];
            *(int128_t *)&v10[224] = (int128_t)v34[224];
            *(uint128_t *)&v10[240] = v43;
            v44 = (int128_t)v34[272];
            *(int128_t *)&v10[0x100] = (int128_t)v34[0x100];
            *(uint128_t *)&v10[272] = v44;
            v45 = (int128_t)v34[304];
            *(int128_t *)&v10[288] = (int128_t)v34[288];
            *(uint128_t *)&v10[304] = v45;
            v46 = (int128_t)v34[336];
            *(int128_t *)&v10[320] = (int128_t)v34[320];
            *(uint128_t *)&v10[336] = v46;
            v47 = (int128_t)v34[368];
            *(int128_t *)&v10[352] = (int128_t)v34[352];
            *(uint128_t *)&v10[368] = v47;
            v48 = (int128_t)v34[400];
            *(int128_t *)&v10[384] = (int128_t)v34[384];
            *(uint128_t *)&v10[400] = v48;
            v49 = (int128_t)v34[432];
            *(int128_t *)&v10[416] = (int128_t)v34[416];
            *(uint128_t *)&v10[432] = v49;
            v50 = (int128_t)v34[464];
            *(int128_t *)&v10[448] = (int128_t)v34[448];
            *(uint128_t *)&v10[464] = v50;
            v51 = (int128_t)v34[496];
            *(int128_t *)&v10[480] = (int128_t)v34[480];
            *(uint128_t *)&v10[496] = v51;
            v52 = (int128_t)v34[528];
            *(int128_t *)&v10[0x200] = (int128_t)v34[0x200];
            *(uint128_t *)&v10[528] = v52;
            v53 = (int128_t)v34[560];
            *(int128_t *)&v10[544] = (int128_t)v34[544];
            *(uint128_t *)&v10[560] = v53;
            v54 = (int128_t)v34[592];
            *(int128_t *)&v10[576] = (int128_t)v34[576];
            *(uint128_t *)&v10[592] = v54;
            v55 = (int128_t)v34[624];
            *(int128_t *)&v10[608] = (int128_t)v34[608];
            *(uint128_t *)&v10[624] = v55;
            v56 = (int128_t)v34[656];
            *(int128_t *)&v10[640] = (int128_t)v34[640];
            *(uint128_t *)&v10[656] = v56;
        }
        *(unsigned long long *)&v10[16] = 2456424;
    }
    else if (a2 == 2)
    {
        v8 = *a1;
        v9 = (long long)v8[24];
        v10 = operatornew(672);
        _bzero(v10, 672);
        if (31 >= v10 - v8)
        {
            i = 0;
            do
            {
                *((char *)v10 + i) = *((char *)v8 + i);
                i += 1;
            } while (i != 672);
        }
        else
        {
            v12 = (int128_t)v8[16];
            *(int128_t *)v10 = *(int128_t *)v8;
            *(uint128_t *)&v10[16] = v12;
            v13 = (int128_t)v8[48];
            *(int128_t *)&v10[32] = (int128_t)v8[32];
            *(uint128_t *)&v10[48] = v13;
            v14 = (int128_t)v8[80];
            *(int128_t *)&v10[64] = (int128_t)v8[64];
            *(uint128_t *)&v10[80] = v14;
            v15 = (int128_t)v8[112];
            *(int128_t *)&v10[96] = (int128_t)v8[96];
            *(uint128_t *)&v10[112] = v15;
            v16 = (int128_t)v8[144];
            *(int128_t *)&v10[128] = (int128_t)v8[128];
            *(uint128_t *)&v10[144] = v16;
            v17 = (int128_t)v8[176];
            *(int128_t *)&v10[160] = (int128_t)v8[160];
            *(uint128_t *)&v10[176] = v17;
            v18 = (int128_t)v8[208];
            *(int128_t *)&v10[192] = (int128_t)v8[192];
            *(uint128_t *)&v10[208] = v18;
            v19 = (int128_t)v8[240];
            *(int128_t *)&v10[224] = (int128_t)v8[224];
            *(uint128_t *)&v10[240] = v19;
            v20 = (int128_t)v8[272];
            *(int128_t *)&v10[0x100] = (int128_t)v8[0x100];
            *(uint128_t *)&v10[272] = v20;
            v21 = (int128_t)v8[304];
            *(int128_t *)&v10[288] = (int128_t)v8[288];
            *(uint128_t *)&v10[304] = v21;
            v22 = (int128_t)v8[336];
            *(int128_t *)&v10[320] = (int128_t)v8[320];
            *(uint128_t *)&v10[336] = v22;
            v23 = (int128_t)v8[368];
            *(int128_t *)&v10[352] = (int128_t)v8[352];
            *(uint128_t *)&v10[368] = v23;
            v24 = (int128_t)v8[400];
            *(int128_t *)&v10[384] = (int128_t)v8[384];
            *(uint128_t *)&v10[400] = v24;
            v25 = (int128_t)v8[432];
            *(int128_t *)&v10[416] = (int128_t)v8[416];
            *(uint128_t *)&v10[432] = v25;
            v26 = (int128_t)v8[464];
            *(int128_t *)&v10[448] = (int128_t)v8[448];
            *(uint128_t *)&v10[464] = v26;
            v27 = (int128_t)v8[496];
            *(int128_t *)&v10[480] = (int128_t)v8[480];
            *(uint128_t *)&v10[496] = v27;
            v28 = (int128_t)v8[528];
            *(int128_t *)&v10[0x200] = (int128_t)v8[0x200];
            *(uint128_t *)&v10[528] = v28;
            v29 = (int128_t)v8[560];
            *(int128_t *)&v10[544] = (int128_t)v8[544];
            *(uint128_t *)&v10[560] = v29;
            v30 = (int128_t)v8[592];
            *(int128_t *)&v10[576] = (int128_t)v8[576];
            *(uint128_t *)&v10[592] = v30;
            v31 = (int128_t)v8[624];
            *(int128_t *)&v10[608] = (int128_t)v8[608];
            *(uint128_t *)&v10[624] = v31;
            v32 = (int128_t)v8[656];
            *(int128_t *)&v10[640] = (int128_t)v8[640];
            *(uint128_t *)&v10[656] = v32;
        }
        *(unsigned long long *)&v10[24] = 2462860;
    }
    else
    {
        return v33;
    }
    *a1 = v10;
    v57 = operatornew(32);
    v57->field_0 = 0;
    v57->field_8 = v9;
    v57->field_10 = 0;
    v57->field_18 = 0;
    v4 = a1;
    v5 = v57;
    sub_2592b4(&g_f11980, &v4);
    return v58;
}
