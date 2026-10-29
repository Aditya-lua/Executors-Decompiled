/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf8398..0xaf8658 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af8398_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[4];
    unsigned long long field_18;
    char padding_20[4];
    double field_24;
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[40];
    unsigned long long field_58;
} st_af8398_0;

extern long long g_af8388;
extern long long g_af8754;

unsigned long long sub_af8398(void* a0, st_af8398_0 *a1)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned long long v21;  // w8
    unsigned long long v22;  // w8
    unsigned long long v23;  // 4118
    unsigned long long v24;  // 4118
    unsigned int v25;  // w8
    unsigned long long v26;  // 4118
    unsigned long long v27;  // 4118
    unsigned long long v28;  // 4118
    unsigned long long v29;  // x8
    unsigned long long v30;  // w8
    unsigned long long v13;  // x24
    unsigned long long v31;  // x0
    unsigned long long v32;  // x21
    unsigned long long v33;  // x0
    unsigned long long v34;  // x0
    unsigned long long *v35;  // x25
    unsigned long long *v36;  // x26
    unsigned long len;  // x22
    unsigned long long v38;  // x0
    unsigned long long v39;  // x23
    unsigned long long v40;  // x0
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long v20;  // x24
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a1)
        return 1;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = a1->field_10 | (int)a0[16];
    if (v20 >> 4 & 1)
        *(unsigned int *)&a0[16] = 0;
    if (v20 >> 3 & 1)
        return 1;
    v21 = (unsigned long long)a1->padding_20;
    if (!(v20 >> 1 & 1))
    {
        if (v21)
        {
            if (!(v20 & 1) && (int)a0[32])
            {
                v22 = (unsigned long long)(a1->padding_20)[1];
                if (v22)
                    goto LABEL_af842c;
                goto LABEL_af8438;
            }
            else
            {
                *(unsigned int *)&a0[32] = v21;
            }
        }
        v22 = (unsigned long long)(a1->padding_20)[1];
        if (v22)
        {
            if (v20 & 1)
                goto LABEL_af8434;
LABEL_af842c:
            if (!(int)a0[36])
            {
LABEL_af8434:
                *(unsigned int *)&a0[36] = v22;
            }
        }
LABEL_af8438:
        v23 = arm64g_calculate_condition(1, (int)a1->field_24, 1, 0);
        if (!(v23 & 1))
        {
            if (!(v20 & 1) && !(v24 = arm64g_calculate_condition(1, (int)a0[40], 1, 0), v24 & 1))
            {
                v25 = *(int *)((char *)&a1->field_24 + 4);
                v26 = arm64g_calculate_condition(0x11, v25, 1, 0);
                if (v26 & 1)
                    goto LABEL_af8478;
                goto LABEL_af8488;
            }
            else
            {
                *(int *)&a0[40] = (int)a1->field_24;
            }
        }
        v25 = *(int *)((char *)&a1->field_24 + 4);
        v27 = arm64g_calculate_condition(1, v25, 1, 0);
        if (!(v27 & 1))
        {
            if (v20 & 1)
                goto LABEL_af8484;
LABEL_af8478:
            v28 = arm64g_calculate_condition(0x11, (int)a0[44], 1, 0);
            if (!(v28 & 1))
            {
LABEL_af8484:
                *(unsigned int *)&a0[44] = v25;
            }
        }
LABEL_af8488:
        v29 = (long long)a0[24];
        if (v29 >> 1 & 1)
            goto LABEL_af84a0;
    }
    else
    {
        *(unsigned int *)&a0[32] = v21;
        *(double *)&a0[36] = *(double *)(a1->padding_20)[1];
        *(int *)&a0[44] = *(int *)((char *)&a1->field_24 + 4);
        v29 = (long long)a0[24];
    }
    *(unsigned long long *)&a0[8] = a1->field_8;
    v29 &= 0xfffffffffffffffd;
    *(unsigned long long *)&a0[24] = v29;
LABEL_af84a0:
    if (v20 >> 2 & 1)
    {
        v29 = 0;
        *(unsigned long long *)&a0[24] = 0;
    }
    *(unsigned long long *)&a0[24] = v29 | a1->field_18;
    if (v20 >> 1 & 1)
    {
        v33 = sub_af8658(a0);
        if (!(unsigned int)v33)
            return v33;
        *(int *)&a0[64] = *(int *)&a1->padding_30[8];
        goto LABEL_af8538;
    }
    if (*(long long *)&a1->field_28)
    {
        if (!(v20 & 1) && (long long)a0[48])
        {
            v30 = *(int *)&a1->padding_30[8];
            if (v30)
                goto LABEL_af850c;
            goto LABEL_af8518;
        }
        else
        {
            v31 = sub_af8658(a0);
            if (!(unsigned int)v31)
                return v31;
        }
    }
    v30 = *(int *)&a1->padding_30[8];
    if (v30)
    {
        if (v20 & 1)
            goto LABEL_af8514;
LABEL_af850c:
        if (!(int)a0[64])
        {
LABEL_af8514:
            *(unsigned int *)&a0[64] = v30;
        }
    }
LABEL_af8518:
    if (!*(long long *)&a1->padding_30[0])
        goto LABEL_af8574;
    if (!(v20 & 1) && (long long)a0[56])
    {
        v32 = *(long long *)&a1->padding_30[24];
        if (v32)
            goto LABEL_af8580;
        goto LABEL_af8610;
    }
    else
    {
LABEL_af8538:
        sub_ad6958((long long)a0[56], &g_af8388);
        *(unsigned long long *)&a0[56] = 0;
        if (*(long long *)&a1->padding_30[0])
        {
            v34 = sub_ad606c(*(long long *)&a1->padding_30[0], &g_af8754, &g_af8388);
            *(unsigned long long *)&a0[56] = v34;
            if (!v34)
                return v34;
        }
        if (!(v20 >> 1 & 1))
        {
LABEL_af8574:
            v32 = *(long long *)&a1->padding_30[24];
            if (v32)
            {
                if (v20 & 1)
                    goto LABEL_af8588;
LABEL_af8580:
                if (!(long long)a0[80])
                {
LABEL_af8588:
                    v35 = a0 + 80;
                    v36 = a0 + 88;
                    goto LABEL_af85a4;
                }
            }
LABEL_af8610:
            if (a1->field_58 && (v20 & 1 || !(long long)a0[96]))
                goto LABEL_af862c;
        }
        else
        {
            v32 = *(long long *)&a1->padding_30[24];
            v35 = a0 + 80;
            v36 = a0 + 88;
            if (v32)
            {
LABEL_af85a4:
                len = *(long long *)&a1->padding_30[32];
                if (!*(long long *)&a1->padding_30[32])
                    len = _strlen(v32);
                v38 = sub_a6bf4c(len + 1, "crypto/x509/x509_vpm.c", 243);
                if (!v38)
                    return v38;
                v39 = v38;
                _memcpy();
                *(char *)(v39 + len) = 0;
                goto LABEL_af85f0;
            }
            len = 0;
            v39 = 0;
LABEL_af85f0:
            sub_a6c2e4(*v35, "crypto/x509/x509_vpm.c", 252);
            *v35 = v39;
            *v36 = len;
            if (!(v20 >> 1 & 1))
                goto LABEL_af8610;
LABEL_af862c:
            v40 = sub_af8764(a0);
            if (!(unsigned int)v40)
                return v40;
        }
    }
    return 1;
}
