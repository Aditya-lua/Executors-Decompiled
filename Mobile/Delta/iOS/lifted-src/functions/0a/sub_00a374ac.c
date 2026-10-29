/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa374ac..0xa37818 (876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a374ac_2 {
    char padding_0[128];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    char padding_104[60];
    unsigned long long field_140;
    char padding_148[120];
    unsigned int field_1c0;
    char padding_1c4[60];
    unsigned long long field_200;
    char padding_208[120];
    unsigned int field_280;
    unsigned int field_284;
} st_a374ac_2;

typedef struct st_a374ac_0 {
    char padding_0[128];
    unsigned long long field_80;
    char padding_88[120];
    char field_100;
    char padding_101[127];
    char field_180;
    char padding_181[127];
    unsigned int field_200;
    char padding_204[60];
    char field_240;
    char padding_241[127];
    unsigned int field_2c0;
    char padding_2c4[60];
    char field_300;
    char padding_301[127];
    unsigned int field_380;
    unsigned int field_384;
} st_a374ac_0;

typedef struct st_a374ac_1 {
    unsigned int field_0;
    char padding_4[892];
    unsigned int field_380;
    unsigned int field_384;
} st_a374ac_1;


void sub_a374ac(st_a374ac_0 *a0)
{
    unsigned long long v27;  // x28
    unsigned long long v28;  // x27
    unsigned long long v37;  // x30
    char v38;  // x0
    unsigned long index;  // x24
    st_a374ac_1 *v40;  // x20
    void* v41;  // x26
    unsigned int v42;  // w8
    unsigned long long v43;  // 4143
    unsigned int v44;  // w8
    unsigned long idx;  // x27
    char v46;  // w8
    unsigned long long v29;  // x26
    char v47;  // x23
    unsigned int v48;  // w21
    char v49;  // x22
    char v50;  // x0
    char v51;  // x0
    char v52;  // x22
    char v53;  // x0
    char v54;  // w8
    unsigned long long v30;  // x25
    unsigned long long v31;  // x24
    unsigned long long v32;  // x23
    unsigned long long v33;  // x22
    unsigned long long v34;  // x21
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    unsigned int *v0;  // [bp-0xd0]
    unsigned long long *v1;  // [bp-0xc8]
    unsigned long long *v2;  // [bp-0xc0]
    unsigned int *v3;  // [bp-0xb8]
    unsigned long long *v4;  // [bp-0xb0]
    unsigned long long *v5;  // [bp-0xa8]
    unsigned long long *v6;  // [bp-0xa0]
    unsigned long v7;  // [bp-0x98]
    char *v8;  // [bp-0x90]
    st_a374ac_2 *v9;  // [bp-0x88]
    void* v10;  // [bp-0x80]
    void* v11;  // [bp-0x78]
    unsigned int *v12;  // [bp-0x70]
    void* v13;  // [bp-0x68]
    unsigned long long v14;  // [bp-0x60]
    unsigned long long v15;  // [bp-0x58]
    unsigned long long v16;  // [bp-0x50]
    unsigned long long v17;  // [bp-0x48]
    unsigned long long v18;  // [bp-0x40]
    unsigned long long v19;  // [bp-0x38]
    unsigned long long v20;  // [bp-0x30]
    unsigned long long v21;  // [bp-0x28]
    unsigned long long v22;  // [bp-0x20]
    unsigned long long v23;  // [bp-0x18]
    char *v24;  // [bp-0x10]
    unsigned long long v25;  // [bp-0x8]
    char v26;  // [bp+0x0]

    if (!a0)
        return;
    v14 = v27;
    v15 = v28;
    v16 = v29;
    v17 = v30;
    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = &v26;
    v25 = v37;
    if (a0->field_384 == a0->field_380)
        return;
    v38 = sub_a35bc0();
    if (v38)
    {
        index = a0->field_384;
        if ((unsigned int)index != a0->field_380)
        {
            v40 = (st_a374ac_1 *)v38;
            v41 = v38 + 0x200;
            v7 = v38 + 64;
            v8 = v38 + 384;
            v6 = v38 + 128;
            v12 = v38 + 704;
            v10 = v38 + 0x100;
            v11 = v38 + 576;
            v13 = v38 + 0x300;
            v4 = &a0->field_240;
            v5 = &a0->field_80;
            v2 = &a0->field_300;
            v3 = &a0->field_2c0;
            v9 = &a0->field_100;
            v0 = &a0->field_200;
            v1 = &a0->field_180;
            do
            {
                index = (unsigned int)index + 1 & 15;
                if ((unsigned int)(*(int *)&a0->padding_0[4 * index]) >> 1 & 1)
                    continue;
                v42 = v40->field_380 + 1;
                v43 = arm64g_calculate_condition(67, 0, v42, 0);
                if (v43 & 1)
                    v44 = v42 & 15;
                else
                    v44 = -(-v42 & 15);
                v40->field_380 = v44;
                if (v44 == v40->field_384)
                    v40->field_384 = (char)(v44 + 1 - ((char)v44 + 1 + ((char)(__ROL__((char)v44 + 1, 21)) & 15) & 240));
                idx = v44;
                if (!(*(int *)((char *)v41 + 4 * v44) & 1))
                {
                    v46 = 0;
                    *(unsigned long long *)((char *)v10 + 8 * idx) = 0;
                    *(unsigned long long *)&v8[8 * idx] = 0;
                }
                else
                {
                    if (!*(long long *)((char *)v10 + 8 * idx))
                        goto LABEL_a37640;
                    *(char *)*(long long *)((char *)v10 + 8 * idx) = 0;
                    v46 = 1;
                }
                *(unsigned int *)((char *)v41 + 4 * idx) = v46;
LABEL_a37640:
                *(unsigned int *)(v7 + idx * 4) = 0;
                (&v40->field_0)[idx] = 0;
                v6[idx] = 0;
                v12[idx] = 0xffffffff;
                sub_a6c2e4(*(long long *)((char *)v11 + 8 * idx), "crypto/err/err_local.h", 92);
                *(unsigned long long *)((char *)v11 + 8 * idx) = 0;
                sub_a6c2e4(*(long long *)((char *)v13 + 8 * idx), "crypto/err/err_local.h", 94);
                *(unsigned long long *)((char *)v13 + 8 * idx) = 0;
                (&v40->field_0)[idx] = *(int *)&a0->padding_0[4 * index];
                v6[idx] = v5[index];
                v47 = v4[index];
                v48 = v3[index];
                v49 = v2[index];
                sub_a6c2e4(*(long long *)((char *)v11 + 8 * idx), "crypto/err/err_local.h", 56);
                if (v47 && *(char *)v47)
                {
                    v50 = sub_a6bf4c(_strlen(v47) + 1, 0, 0);
                    *(unsigned long long *)((char *)v11 + 8 * idx) = v50;
                    if (v50)
                        _strcpy();
                }
                else
                {
                    *(unsigned long long *)((char *)v11 + 8 * idx) = 0;
                }
                v12[idx] = v48;
                sub_a6c2e4(*(long long *)((char *)v13 + 8 * idx), "crypto/err/err_local.h", 66);
                if (v49 && *(char *)v49)
                {
                    v51 = sub_a6bf4c(_strlen(v49) + 1, 0, 0);
                    *(unsigned long long *)((char *)v13 + 8 * idx) = v51;
                    if (v51)
                        _strcpy();
                }
                else
                {
                    *(unsigned long long *)((char *)v13 + 8 * idx) = 0;
                }
                if (*(long long *)&v9->padding_0[8 * index] && (v52 = v1[index], v52))
                {
                    v53 = sub_a6bf4c(v52, 0, 0);
                    if (!v53)
                        continue;
                    _memcpy();
                    if (*((char *)v41 + 4 * idx) & 1)
                        sub_a6c2e4(*(long long *)((char *)v10 + 8 * idx), "crypto/err/err_local.h", 79);
                    v54 = v0[index] | 1;
                    *(unsigned long long *)((char *)v10 + 8 * idx) = v53;
                    *(unsigned long long *)&v8[8 * idx] = v52;
                }
                else if (!(*((char *)v41 + 4 * idx) & 1))
                {
                    v54 = 0;
                    *(unsigned long long *)((char *)v10 + 8 * idx) = 0;
                    *(unsigned long long *)&v8[8 * idx] = 0;
                }
                else
                {
                    if (!*(long long *)((char *)v10 + 8 * idx))
                        continue;
                    *(char *)*(long long *)((char *)v10 + 8 * idx) = 0;
                    v54 = 1;
                }
                *(unsigned int *)((char *)v41 + 4 * idx) = v54;
            } while (index != a0->field_380);
        }
    }
    return;
}
