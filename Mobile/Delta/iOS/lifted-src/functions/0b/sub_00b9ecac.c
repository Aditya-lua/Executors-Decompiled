/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9ecac..0xb9ee34 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b9ecac_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b9ecac_0;

typedef struct st_b9ecac_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
} st_b9ecac_1;


double sub_b9ecac(st_b9ecac_0 *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v9;  // x1
    st_b9ecac_0 *v10;  // x20
    st_b9ecac_1 *v19;  // x8
    long long v20;  // x0
    unsigned long long v21;  // 4102
    long long v22;  // x0
    unsigned long long v11;  // x22
    unsigned long long *v12;  // x23
    unsigned long long ptr;  // x0
    unsigned long long *i;  // x8
    unsigned long long v15;  // x26
    unsigned long long *v16;  // x27
    unsigned long long *v17;  // x27
    unsigned long long v18;  // x28
    uint128_t v0;  // [bp-0xc0]
    unsigned long long v1;  // [bp-0xb0]
    uint128_t v2;  // [bp-0xa8]
    uint128_t v3;  // [bp-0x98]
    uint128_t v4;  // [bp-0x88]
    uint128_t v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a2 * 72;
    if (a2 > 128102389400760775)
        a0 = sub_c6b970(0);
    v10 = a0;
    if (v9)
    {
        v11 = a1;
        v12 = v9;
        ptr = _malloc(v9);
        if (!ptr)
        {
LABEL_b9ede8:
            v20 = sub_c6b970(8, v12);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v21 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v21 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90(v2);
            }
            v1 = v11;
            sub_b9dd40(&v0);
            v22 = __Unwind_Resume(v20);
            sub_c73e0c(v22);
        }
        v0 = CONCAT(ptr, a2);
        if (a2)
        {
            v11 = 0;
            v12 = v11 + 72 * a2;
            v15 = a2;
            while (i != v12)
            {
                v15 -= 1;
                v16 = i;
                v17 = v16 + 9;
                v18 = v11 + 1;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                if ((long long)/* unsupported instruction */ < 0)
                {
                    sub_c769bc();
                    goto LABEL_b9ede8;
                }
                *(unsigned long long *)&v2 = *v16;
                sub_b9e2f0((char *)&v2 + 8, i + 1);
                v19 = ptr + 72 * v11;
                v19->field_20 = v4;
                v19->field_30 = v5;
                v19->field_40 = v6;
                v19->field_0 = v2;
                v19->field_10 = v3;
                v11 = v18;
                i = v17;
                if (!v15)
                    break;
            }
        }
    }
    else
    {
        v0 = CONCAT(8, 0);
    }
    v10->field_0 = v0;
    v10->field_10 = a2;
    return (unsigned long long)v0;
}
