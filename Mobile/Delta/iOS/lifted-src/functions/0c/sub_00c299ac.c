/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc299ac..0xc29a9c (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c299ac_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c299ac_0;


double sub_c299ac(st_c299ac_0 *a0, long long a1, unsigned long long i)
{
    unsigned long long v8;  // x0
    unsigned long long v9;  // x21
    long long v10;  // x22
    unsigned long long ptr;  // x0
    uint128_t *iter;  // x23
    unsigned long long v13;  // x24
    long long v14;  // x0
    unsigned long long v15;  // x24
    long long v16;  // x0
    uint128_t v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x88]
    uint128_t v2;  // [bp-0x80]
    uint128_t v3;  // [bp-0x70]
    uint128_t v4;  // [bp-0x60]
    uint128_t v5;  // [bp-0x50]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = 0;
    v9 = i * 64;
    if (i <= 0x3ffffffffffffff && 0x7ffffffffffffff8 >= v9)
    {
        if (v9)
        {
            v10 = a1;
            ptr = _malloc(v9);
            if (ptr)
            {
                iter = ptr;
                v0 = CONCAT(ptr, i);
                if (!i)
                {
                    a0->field_0 = v0;
                    a0->field_10 = i;
                    return (unsigned long long)v0;
                }
                v13 = 0;
                do
                {
                    if (!v9)
                        break;
                    sub_c28e58(&v2, v10);
                    v13 += 1;
                    v10 += 64;
                    *iter = v2;
                    iter[1] = v3;
                    iter[2] = v4;
                    iter[3] = v5;
                    v9 -= 64;
                    iter += 4;
                } while (i != v13);
                goto LABEL_c29a50;
            }
            else
            {
                v8 = 8;
            }
        }
        else
        {
            v0 = CONCAT(8, 0);
LABEL_c29a50:
            a0->field_0 = v0;
            a0->field_10 = i;
            return (unsigned long long)v0;
        }
    }
    v14 = sub_c6b970(v8, v9);
    v1 = v15;
    sub_c2681c(&v0);
    v16 = __Unwind_Resume(v14);
    sub_c73e0c(v16);
}
