/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25c0a0..0x25c3ec (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25c0a0_1 {
    long long field_0;
    unsigned long long field_8;
    long long field_10;
    long long field_18;
} st_25c0a0_1;

typedef struct st_25c0a0_0 {
    void* field_0;
} st_25c0a0_0;

typedef struct st_25c0a0_2 {
    char field_0;
} st_25c0a0_2;

extern long long g_f11980;

int sub_25c0a0(unsigned int a0, st_25c0a0_0 **a1, unsigned int *a2, unsigned long long *a3)
{
    void* *v6;  // x20
    unsigned int v7;  // w8
    long long j;  // x8
    uint128_t v17;  // q1
    uint128_t v18;  // q1
    uint128_t v19;  // q1
    uint128_t v20;  // q1
    uint128_t v21;  // q1
    uint128_t v22;  // q1
    uint128_t v23;  // q1
    uint128_t v24;  // q1
    uint128_t v25;  // q1
    void* v8;  // x22
    uint128_t v26;  // q1
    uint128_t v27;  // q1
    uint128_t v28;  // q1
    uint128_t v29;  // q1
    uint128_t v30;  // q1
    uint128_t v31;  // q1
    uint128_t v32;  // q1
    uint128_t v33;  // q1
    uint128_t v34;  // q1
    uint128_t v35;  // q1
    unsigned long v9;  // x21
    uint128_t v36;  // q1
    uint128_t v37;  // q1
    unsigned int v38;  // w0
    long long l;  // x8
    uint128_t v40;  // q1
    uint128_t v41;  // q1
    uint128_t v42;  // q1
    uint128_t v43;  // q1
    uint128_t v44;  // q1
    uint128_t v45;  // q1
    void* v10;  // x19
    uint128_t v46;  // q1
    uint128_t v47;  // q1
    uint128_t v48;  // q1
    uint128_t v49;  // q1
    uint128_t v50;  // q1
    uint128_t v51;  // q1
    uint128_t v52;  // q1
    uint128_t v53;  // q1
    uint128_t v54;  // q1
    uint128_t v55;  // q1
    long long i;  // x8
    uint128_t v56;  // q1
    uint128_t v57;  // q1
    uint128_t v58;  // q1
    uint128_t v59;  // q1
    uint128_t v60;  // q1
    st_25c0a0_1 *v61;  // x0
    unsigned int v62;  // w0
    unsigned int v12;  // w0
    void* v13;  // x22
    long long k;  // x8
    unsigned int v15;  // w0
    st_25c0a0_2 **v0;  // [bp-0x68], Other Possible Types: char
    st_25c0a0_2 *v1;  // [bp-0x60]
    void* *v2;  // [bp-0x40]
    st_25c0a0_1 *v3;  // [bp-0x38]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = *a1;
    v7 = *a2;
    if (*a3 != 11761300629498821096)
    {
        if (*a3 != 0xeaecffbed6f1f96d)
            return v15;
        v1 = &v0;
        v0 = &v1;
        if (v7 != 3)
        {
            if (v7 != 2)
                return v12;
            v8 = *v6;
            v9 = (long long)v8[24];
            v10 = operatornew(672);
            _bzero(v10, 672);
            if (31 < v10 - v8)
                goto LABEL_25c1b8;
            i = 0;
            do
            {
                *((char *)v10 + i) = *((char *)v8 + i);
                i += 1;
            } while (i != 672);
        }
        else
        {
            v13 = *v6;
            v9 = (long long)v13[16];
            v10 = operatornew(672);
            _bzero(v10, 672);
            if (31 < v10 - v13)
                goto LABEL_25c2f8;
            k = 0;
            do
            {
                *((char *)v10 + k) = *((char *)v13 + k);
                k += 1;
            } while (k != 672);
            goto LABEL_25c3a0;
        }
    }
    else
    {
        v1 = &v0;
        v0 = &v1;
        if (v7 != 3)
        {
            if (v7 != 2)
                return v38;
            v8 = *v6;
            v9 = (long long)v8[24];
            v10 = operatornew(672);
            _bzero(v10, 672);
            if (31 >= v10 - v8)
            {
                j = 0;
                do
                {
                    *((char *)v10 + j) = *((char *)v8 + j);
                    j += 1;
                } while (j != 672);
            }
            else
            {
LABEL_25c1b8:
                v17 = (int128_t)v8[16];
                *(int128_t *)v10 = *(int128_t *)v8;
                *(uint128_t *)&v10[16] = v17;
                v18 = (int128_t)v8[48];
                *(int128_t *)&v10[32] = (int128_t)v8[32];
                *(uint128_t *)&v10[48] = v18;
                v19 = (int128_t)v8[80];
                *(int128_t *)&v10[64] = (int128_t)v8[64];
                *(uint128_t *)&v10[80] = v19;
                v20 = (int128_t)v8[112];
                *(int128_t *)&v10[96] = (int128_t)v8[96];
                *(uint128_t *)&v10[112] = v20;
                v21 = (int128_t)v8[144];
                *(int128_t *)&v10[128] = (int128_t)v8[128];
                *(uint128_t *)&v10[144] = v21;
                v22 = (int128_t)v8[176];
                *(int128_t *)&v10[160] = (int128_t)v8[160];
                *(uint128_t *)&v10[176] = v22;
                v23 = (int128_t)v8[208];
                *(int128_t *)&v10[192] = (int128_t)v8[192];
                *(uint128_t *)&v10[208] = v23;
                v24 = (int128_t)v8[240];
                *(int128_t *)&v10[224] = (int128_t)v8[224];
                *(uint128_t *)&v10[240] = v24;
                v25 = (int128_t)v8[272];
                *(int128_t *)&v10[0x100] = (int128_t)v8[0x100];
                *(uint128_t *)&v10[272] = v25;
                v26 = (int128_t)v8[304];
                *(int128_t *)&v10[288] = (int128_t)v8[288];
                *(uint128_t *)&v10[304] = v26;
                v27 = (int128_t)v8[336];
                *(int128_t *)&v10[320] = (int128_t)v8[320];
                *(uint128_t *)&v10[336] = v27;
                v28 = (int128_t)v8[368];
                *(int128_t *)&v10[352] = (int128_t)v8[352];
                *(uint128_t *)&v10[368] = v28;
                v29 = (int128_t)v8[400];
                *(int128_t *)&v10[384] = (int128_t)v8[384];
                *(uint128_t *)&v10[400] = v29;
                v30 = (int128_t)v8[432];
                *(int128_t *)&v10[416] = (int128_t)v8[416];
                *(uint128_t *)&v10[432] = v30;
                v31 = (int128_t)v8[464];
                *(int128_t *)&v10[448] = (int128_t)v8[448];
                *(uint128_t *)&v10[464] = v31;
                v32 = (int128_t)v8[496];
                *(int128_t *)&v10[480] = (int128_t)v8[480];
                *(uint128_t *)&v10[496] = v32;
                v33 = (int128_t)v8[528];
                *(int128_t *)&v10[0x200] = (int128_t)v8[0x200];
                *(uint128_t *)&v10[528] = v33;
                v34 = (int128_t)v8[560];
                *(int128_t *)&v10[544] = (int128_t)v8[544];
                *(uint128_t *)&v10[560] = v34;
                v35 = (int128_t)v8[592];
                *(int128_t *)&v10[576] = (int128_t)v8[576];
                *(uint128_t *)&v10[592] = v35;
                v36 = (int128_t)v8[624];
                *(int128_t *)&v10[608] = (int128_t)v8[608];
                *(uint128_t *)&v10[624] = v36;
                v37 = (int128_t)v8[656];
                *(int128_t *)&v10[640] = (int128_t)v8[640];
                *(uint128_t *)&v10[656] = v37;
            }
        }
        else
        {
            v13 = *v6;
            v9 = (long long)v13[16];
            v10 = operatornew(672);
            _bzero(v10, 672);
            if (31 >= v10 - v13)
            {
                l = 0;
                do
                {
                    *((char *)v10 + l) = *((char *)v13 + l);
                    l += 1;
                } while (l != 672);
            }
            else
            {
LABEL_25c2f8:
                v40 = (int128_t)v13[16];
                *(int128_t *)v10 = *(int128_t *)v13;
                *(uint128_t *)&v10[16] = v40;
                v41 = (int128_t)v13[48];
                *(int128_t *)&v10[32] = (int128_t)v13[32];
                *(uint128_t *)&v10[48] = v41;
                v42 = (int128_t)v13[80];
                *(int128_t *)&v10[64] = (int128_t)v13[64];
                *(uint128_t *)&v10[80] = v42;
                v43 = (int128_t)v13[112];
                *(int128_t *)&v10[96] = (int128_t)v13[96];
                *(uint128_t *)&v10[112] = v43;
                v44 = (int128_t)v13[144];
                *(int128_t *)&v10[128] = (int128_t)v13[128];
                *(uint128_t *)&v10[144] = v44;
                v45 = (int128_t)v13[176];
                *(int128_t *)&v10[160] = (int128_t)v13[160];
                *(uint128_t *)&v10[176] = v45;
                v46 = (int128_t)v13[208];
                *(int128_t *)&v10[192] = (int128_t)v13[192];
                *(uint128_t *)&v10[208] = v46;
                v47 = (int128_t)v13[240];
                *(int128_t *)&v10[224] = (int128_t)v13[224];
                *(uint128_t *)&v10[240] = v47;
                v48 = (int128_t)v13[272];
                *(int128_t *)&v10[0x100] = (int128_t)v13[0x100];
                *(uint128_t *)&v10[272] = v48;
                v49 = (int128_t)v13[304];
                *(int128_t *)&v10[288] = (int128_t)v13[288];
                *(uint128_t *)&v10[304] = v49;
                v50 = (int128_t)v13[336];
                *(int128_t *)&v10[320] = (int128_t)v13[320];
                *(uint128_t *)&v10[336] = v50;
                v51 = (int128_t)v13[368];
                *(int128_t *)&v10[352] = (int128_t)v13[352];
                *(uint128_t *)&v10[368] = v51;
                v52 = (int128_t)v13[400];
                *(int128_t *)&v10[384] = (int128_t)v13[384];
                *(uint128_t *)&v10[400] = v52;
                v53 = (int128_t)v13[432];
                *(int128_t *)&v10[416] = (int128_t)v13[416];
                *(uint128_t *)&v10[432] = v53;
                v54 = (int128_t)v13[464];
                *(int128_t *)&v10[448] = (int128_t)v13[448];
                *(uint128_t *)&v10[464] = v54;
                v55 = (int128_t)v13[496];
                *(int128_t *)&v10[480] = (int128_t)v13[480];
                *(uint128_t *)&v10[496] = v55;
                v56 = (int128_t)v13[528];
                *(int128_t *)&v10[0x200] = (int128_t)v13[0x200];
                *(uint128_t *)&v10[528] = v56;
                v57 = (int128_t)v13[560];
                *(int128_t *)&v10[544] = (int128_t)v13[544];
                *(uint128_t *)&v10[560] = v57;
                v58 = (int128_t)v13[592];
                *(int128_t *)&v10[576] = (int128_t)v13[576];
                *(uint128_t *)&v10[592] = v58;
                v59 = (int128_t)v13[624];
                *(int128_t *)&v10[608] = (int128_t)v13[608];
                *(uint128_t *)&v10[624] = v59;
                v60 = (int128_t)v13[656];
                *(int128_t *)&v10[640] = (int128_t)v13[640];
                *(uint128_t *)&v10[656] = v60;
            }
LABEL_25c3a0:
            *(unsigned long long *)&v10[16] = 2456424;
            *v6 = v10;
            v61 = operatornew(32);
            v61->field_0 = 0;
            v61->field_8 = v9;
            v61->field_10 = 0;
            v61->field_18 = 0;
            v2 = v6;
            v3 = v61;
            sub_2592b4(&g_f11980, &v2);
            return v62;
        }
    }
    *(unsigned long long *)&v10[24] = 2462860;
    *v6 = v10;
    v61 = operatornew(32);
    v61->field_0 = 0;
    v61->field_8 = v9;
    v61->field_10 = 0;
    v61->field_18 = 0;
    v2 = v6;
    v3 = v61;
    sub_2592b4(&g_f11980, &v2);
    return v62;
}
