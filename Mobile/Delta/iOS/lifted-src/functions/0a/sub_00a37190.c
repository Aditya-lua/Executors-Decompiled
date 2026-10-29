/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa37190..0xa374ac (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a37190_1 {
    char padding_0[184];
    unsigned long long field_b8;
} st_a37190_1;

typedef struct st_a37190_0 {
    unsigned int field_0;
    char padding_4[124];
    unsigned long long field_80;
    char padding_88[120];
    unsigned long long field_100;
    char padding_108[120];
    unsigned long long field_180;
    char padding_188[120];
    unsigned int field_200;
    char padding_204[60];
    unsigned long long field_240;
    char padding_248[120];
    unsigned int field_2c0;
    char padding_2c4[60];
    unsigned long long field_300;
    char padding_308[120];
    char field_380;
} st_a37190_0;


void* sub_a37190(void* a0)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    void* iter;  // x27
    char index;  // x0
    st_a37190_0 *v32;  // x19
    char v33;  // w23
    char v34;  // w8
    char v35;  // x28
    unsigned long idx;  // x25
    unsigned long long *node;  // x24
    unsigned int *v38;  // x20
    unsigned long long v21;  // x26
    unsigned long long *v39;  // x26
    unsigned long long i;  // x22
    unsigned long long v41;  // x22
    void* v42;  // x0
    unsigned long long v43;  // x8
    st_a37190_1 *iter1;  // x20
    unsigned long v45;  // x21
    void* iter2;  // x22
    unsigned long long v48;  // 4115
    unsigned long long v22;  // x25
    unsigned long long *v49;  // x19
    unsigned long long j;  // x21
    void* v51;  // x23
    unsigned long long v52;  // x21
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    void* v0;  // [bp-0x90]
    unsigned long long *v1;  // [bp-0x88]
    unsigned int *v2;  // [bp-0x80]
    unsigned long long *v3;  // [bp-0x78]
    unsigned long long *v4;  // [bp-0x70]
    unsigned long long *v5;  // [bp-0x68]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    if (!a0)
        return a0;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    iter = a0;
    index = sub_a35bc0();
    if (index)
    {
        v32 = (st_a37190_0 *)index;
        v33 = *(int *)(index + 896);
        v34 = *(int *)(index + 900);
        if (v34 != *(int *)(index + 896))
        {
            v35 = 0;
            while (!*(int *)&v32->padding_4[60 + 4 * v33])
            {
                if (0 < v33)
                    v33 -= 1;
                else
                    v33 = 15;
                v35 += 1;
                if (v34 == v33)
                {
                    v33 = v34;
                    break;
                }
            }
            if (!v35)
                goto LABEL_a37338;
            idx = v33;
            node = iter + 384;
            v4 = &v32->field_100;
            v5 = &v32->field_80;
            v2 = &v32->field_200;
            v3 = &v32->field_180;
            v0 = iter;
            v1 = &v32->field_240;
            v38 = &v32->field_2c0;
            v39 = &v32->field_300;
            i = v35;
            do
            {
                v41 = i;
                if ((char)iter[0x200] & 1)
                    sub_a6c2e4(*(long long *)((char *)node - 128), "crypto/err/err_local.h", 25);
                idx = (unsigned int)idx + 1 & 15;
                *(unsigned long long *)((char *)node - 128) = 0;
                *node = 0;
                *(unsigned int *)&iter[0x200] = 0;
                *(unsigned int *)&iter[64] = 0;
                *(unsigned int *)iter = 0;
                *(unsigned long long *)((char *)node - 0x100) = 0;
                *(unsigned int *)&iter[704] = 0xffffffff;
                sub_a6c2e4(node[24], "crypto/err/err_local.h", 92);
                node[24] = 0;
                v42 = sub_a6c2e4(node[48], "crypto/err/err_local.h", 94);
                node[48] = 0;
                *(unsigned int *)iter = (&v32->field_0)[idx];
                *(unsigned int *)&iter[64] = 0;
                *(unsigned long long *)((char *)node - 0x100) = v5[idx];
                *(unsigned long long *)((char *)node - 128) = v4[idx];
                *node = v3[idx];
                *(unsigned int *)&iter[0x200] = v2[idx];
                node[24] = v1[idx];
                *(unsigned int *)&iter[704] = v38[idx];
                v43 = v39[idx];
                (&v32->field_0)[idx] = 0;
                v5[idx] = 0;
                node[48] = v43;
                v4[idx] = 0;
                v3[idx] = 0;
                v2[idx] = 0;
                v1[idx] = 0;
                v38[idx] = 0;
                v39[idx] = 0;
                node += 1;
                iter += 4;
                i = v41 - 1;
            } while (i);
            *(unsigned int *)&v32->field_380 = v33;
            iter = v0;
            *(unsigned int *)&iter[900] = 15;
            *(unsigned int *)&iter[896] = v35 - 1;
            if (v35 > 15)
                return v42;
        }
        else
        {
LABEL_a37338:
            v35 = 0;
            *(unsigned long long *)&iter[896] = 0;
        }
        iter1 = iter + v35 * 8 + 384;
        v45 = v35 - 16;
        iter2 = iter + v35 * 4;
        do
        {
            if ((char)iter2[0x200] & 1)
                sub_a6c2e4(*(long long *)(&iter1->padding_0[0] - 128), "crypto/err/err_local.h", 25);
            *(unsigned long long *)(&iter1->padding_0[0] - 128) = 0;
            *(unsigned long long *)&iter1->padding_0[0] = 0;
            *(unsigned int *)&iter2[0x200] = 0;
            *(unsigned int *)&iter2[64] = 0;
            *(unsigned int *)iter2 = 0;
            *(unsigned long long *)(&iter1->padding_0[0] - 0x100) = 0;
            *(unsigned int *)&iter2[704] = 0xffffffff;
            sub_a6c2e4(*(long long *)&iter1[1].padding_0[0], "crypto/err/err_local.h", 92);
            *(unsigned long long *)&iter1[1].padding_0[0] = 0;
            v42 = sub_a6c2e4(*(long long *)&iter1[2].padding_0[0], "crypto/err/err_local.h", 94);
            *(unsigned long long *)&iter1[2].padding_0[0] = 0;
            iter1 = &iter1->padding_0[8];
            iter2 += 4;
            v48 = arm64g_calculate_condition(0x22, v45, 1, 0);
            v45 += 1;
        } while (!(v48 & 1));
        return v42;
    }
    else
    {
        v49 = iter + 384;
        j = 16;
        v51 = iter;
        do
        {
            v52 = j;
            if ((char)v51[0x200] & 1)
                sub_a6c2e4(*(long long *)((char *)v49 - 128), "crypto/err/err_local.h", 25);
            *(unsigned long long *)((char *)v49 - 128) = 0;
            *v49 = 0;
            *(unsigned int *)&v51[0x200] = 0;
            *(unsigned int *)&v51[64] = 0;
            *(unsigned int *)v51 = 0;
            *(unsigned long long *)((char *)v49 - 0x100) = 0;
            *(unsigned int *)&v51[704] = 0xffffffff;
            sub_a6c2e4(v49[24], "crypto/err/err_local.h", 92);
            v49[24] = 0;
            v42 = sub_a6c2e4(v49[48], "crypto/err/err_local.h", 94);
            v49[48] = 0;
            v49 += 1;
            v51 += 4;
            j = v52 - 1;
        } while (j);
        *(unsigned long long *)&iter[896] = 0;
        return v42;
    }
}
