/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbff6b8..0xbff7b0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bff6b8_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bff6b8_0;


double sub_bff6b8(st_bff6b8_0 *a0, unsigned long long a1, unsigned long i)
{
    unsigned long long v6;  // x21
    st_bff6b8_0 *v7;  // x20
    unsigned long long v8;  // x22
    unsigned long long ptr;  // x0
    st_bff6b8_0 *iter;  // x23
    unsigned long long v11;  // x24
    long long v12;  // x0
    unsigned long long v13;  // x24
    long long v14;  // x0
    uint128_t v0;  // [bp-0x70]
    unsigned long long v1;  // [bp-0x60]
    uint128_t v2;  // [bp-0x58]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = i * 24;
    if (i > 384307168202282325)
    {
        a1 = v6;
        a0 = sub_c6b970(0, a1);
    }
    v7 = a0;
    if (v6)
    {
        v8 = a1;
        ptr = _malloc(v6);
        if (!ptr)
        {
            v12 = sub_c6b970(8, v6);
            v1 = v13;
            sub_bfa334(&v0);
            v14 = __Unwind_Resume(v12);
            sub_c73e0c(v14);
        }
        iter = ptr;
        v0 = CONCAT(ptr, i);
        if (i)
        {
            v11 = 0;
            do
            {
                if (!v6)
                    break;
                sub_bff8a0(&v2, v8);
                v11 += 1;
                v8 += 24;
                iter->field_0 = v2;
                iter->field_10 = v3;
                v6 -= 24;
                iter += 1;
            } while (i != v11);
        }
    }
    else
    {
        v0 = CONCAT(8, 0);
    }
    v7->field_0 = v0;
    v7->field_10 = i;
    return *(unsigned long long *)&v0;
}
