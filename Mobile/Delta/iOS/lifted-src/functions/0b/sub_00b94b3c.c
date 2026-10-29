/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94b3c..0xb94cf4 (440 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94b3c_2 {
    uint128_t field_0;
} st_b94b3c_2;

typedef struct st_b94b3c_1 {
    uint128_t field_0;
    struct st_b94b3c_0 *field_8;
} st_b94b3c_1;

typedef struct st_b94b3c_0 {
    unsigned long long field_0;
    char padding_8[8];
    long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
} st_b94b3c_0;


void sub_b94b3c(uint128_t *a0, st_b94b3c_2 **a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long v18;  // x8
    unsigned long v19;  // x21
    st_b94b3c_0 *v20;  // x21
    unsigned long long v21;  // x22
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    uint128_t *v13;  // x20
    st_b94b3c_1 *ptr;  // x0
    st_b94b3c_1 *v15;  // x19
    uint128_t v16;  // q0
    unsigned long long *v17;  // x21
    unsigned long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = a0;
    ptr = _malloc(16);
    if (ptr)
    {
        v15 = ptr;
        v16 = *v13;
        ptr->field_0 = v16;
        v17 = (unsigned long long)v16;
        v13 = *a1;
        sub_b7f144(v17, a1);
        if (*v17 != 10)
            goto LABEL_b94bdc;
        sub_b942a8(v13, v17[2], v17[2] + v17[3] * 16);
        v18 = v17[4];
        v19 = v18 + 8;
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (/* unsupported instruction */)
            goto LABEL_b94c68;
        /* unsupported instruction */;
        if (!(/* unsupported instruction */ ^ 1))
            goto LABEL_b94bbc;
    }
    else
    {
        sub_c6ba70(8, 16);
LABEL_b94c68:
        /* unsupported instruction */;
    }
    v0 = v18;
    sub_c7573c(v18 + 8);
    v18 = v0;
LABEL_b94bbc:
    sub_b88bd4(v13, v18 + 40);
    do
    {
        /* unsupported instruction */;
        if (/* unsupported instruction */ != 1)
        {
            /* unsupported instruction */;
            sub_c75418(v19);
            break;
        }
    } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
LABEL_b94bdc:
    v20 = *(long long *)((char *)&v15->field_0 + 8);
    sub_b7f144(v20, a1);
    if (v20->field_0 == 10)
    {
        sub_b942a8(v13, v20->field_10, v20->field_10 + v20->field_18 * 16);
        v21 = v20->field_20;
        /* unsupported instruction */;
        /* unsupported instruction */;
        if (!/* unsupported instruction */)
        {
            /* unsupported instruction */;
            if (!(/* unsupported instruction */ ^ 1))
                goto LABEL_b94c24;
        }
        else
        {
            /* unsupported instruction */;
        }
        sub_c7573c(v21 + 8);
LABEL_b94c24:
        sub_b88bd4(v13, v21 + 40);
        do
        {
            /* unsupported instruction */;
            if (/* unsupported instruction */ != 1)
            {
                /* unsupported instruction */;
                sub_c75418(v21 + 8);
                break;
            }
        } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
    }
    _free();
    return;
}
