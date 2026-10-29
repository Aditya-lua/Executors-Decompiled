/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc28a0c..0xc28b04 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c28a0c_0 {
    uint128_t field_0;
    struct st_c28a0c_1 *field_10;
} st_c28a0c_0;

typedef struct st_c28a0c_1 {
    unsigned long long field_0;
} st_c28a0c_1;

extern long long g_efc818;

double sub_c28a0c(st_c28a0c_0 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long *v4;  // x22
    unsigned long long *v5;  // x21
    unsigned long long *ptr;  // x0
    unsigned long long *v7;  // x10
    long long v8;  // x0
    long long v9;  // x0
    uint128_t v0;  // [bp-0x48]
    unsigned long long *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (a2 != a1)
    {
        v4 = 12297829382473034411 * (a2 - a1 >> 3);
        v5 = v4 * 8;
        ptr = _malloc(v5);
        if (!ptr)
        {
LABEL_c28adc:
            v8 = sub_c6b970(8, v5);
            v1 = v5;
            sub_b661ac(&v0);
            v9 = __Unwind_Resume(v8);
            sub_c73e0c(v9);
        }
        v5 = 0;
        v0 = CONCAT(ptr, v4);
        do
        {
            v7 = a1 + 24 * v5;
            if (*v7 != 0x8000000000000000)
            {
                sub_c73c64(&g_efc818);
                __debugbreak();
            }
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ < 0)
            {
                sub_c769bc();
                goto LABEL_c28adc;
            }
        } while ((*(unsigned long long *)((char *)ptr + 0x8 * v5) = v7[1], v5 = (char *)v5 + 1, v5 != v4));
    }
    else
    {
        v5 = 0;
        v0 = CONCAT(8, 0);
    }
    a0->field_0 = v0;
    a0->field_10 = v5;
    return (unsigned long long)v0;
}
