/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94938..0xb94b3c (516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94938_1 {
    unsigned long long field_0[2];
    struct st_b94938_2 *field_8;
} st_b94938_1;

typedef struct st_b94938_2 {
    unsigned long long field_0;
    char padding_8[24];
    struct st_b94938_0 *field_20;
} st_b94938_2;

typedef struct st_b94938_0 {
    char padding_0[8];
    char field_8;
    char padding_9[15];
    long long field_18;
    struct st_b94938_1 *field_20;
} st_b94938_0;

typedef struct st_b94938_3 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
    struct st_b94938_1 *field_20;
} st_b94938_3;


void sub_b94938(uint128_t *a0, long long *a1)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_b94938_1 *ptr;  // x0
    st_b94938_1 *v22;  // x19
    uint128_t v23;  // q0
    long long v24;  // x21
    st_b94938_2 *v25;  // x20
    st_b94938_3 *v26;  // x24
    unsigned long v27;  // x23
    unsigned long long i;  // x25
    unsigned long long v29;  // x25
    st_b94938_2 *v30;  // x20
    unsigned long long v13;  // x24
    st_b94938_0 *v31;  // x23
    long long v32;  // x22
    unsigned long long j;  // x24
    unsigned long long v34;  // x24
    unsigned long long v14;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    uint128_t *v20;  // x20
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
    v20 = a0;
    ptr = _malloc(16);
    if (ptr)
    {
        v22 = ptr;
        v23 = *v20;
        *(uint128_t *)ptr->field_0 = v23;
        v24 = *a1;
        v25 = (unsigned long long)v23;
        sub_b7ee20(v25, a1);
        if (v25->field_0 != 10)
            goto LABEL_b949f8;
        v26 = v25->field_20;
        v20 = (v26->padding_0)[1];
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (/* unsupported instruction */)
            goto LABEL_b94aa4;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            goto LABEL_b949ac;
    }
    else
    {
        sub_c6ba70(8, 16);
LABEL_b94aa4:
        /* unsupported instruction */;
    }
    sub_c7573c((v26->padding_0)[1]);
LABEL_b949ac:
    if (v26->field_18)
    {
        v27 = *(long long *)((char *)&v26->field_8 + 8);
        i = v26->field_18 * 8;
        do
        {
            v29 = i;
            sub_b86fc8(v24, 112, v27);
            v27 += 8;
            i = v29 - 8;
        } while (i);
    }
    sub_b872e4(v24, &v26->field_20);
    do
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            sub_c75418(v20);
            break;
        }
    } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
LABEL_b949f8:
    v30 = v22->field_0[1];
    sub_b7ee20(v30, a1);
    if (v30->field_0 == 10)
    {
        v31 = v30->field_20;
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!/* unsupported instruction */)
        {
            /* unsupported instruction */;
            if (!(/* unsupported instruction */ ^ 1))
                goto LABEL_b94a30;
        }
        else
        {
            /* unsupported instruction */;
        }
        sub_c7573c(&v31->field_8);
LABEL_b94a30:
        if (v31->field_20)
        {
            v32 = v31->field_18;
            j = v31->field_20 * 8;
            do
            {
                v34 = j;
                sub_b86fc8(v24, 112, v32);
                v32 += 8;
                j = v34 - 8;
            } while (j);
        }
        sub_b872e4(v24, v31 + 1);
        do
        {
            /* unsupported instruction */;
            if (/* unsupported instruction */ != 1)
            {
                /* unsupported instruction */;
                sub_c75418(&v31->field_8);
                break;
            }
        } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
    }
    _free();
    return;
}
