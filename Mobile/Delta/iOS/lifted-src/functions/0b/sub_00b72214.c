/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb72214..0xb7233c (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b72214_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    void* field_10;
    unsigned long long field_18;
} st_b72214_0;


unsigned long long sub_b72214(st_b72214_0 *a0, void* a1, void* a2)
{
    unsigned long long v5;  // x21
    unsigned long long v6;  // 4144
    unsigned long long ptr;  // x0
    unsigned long long v8;  // x22
    unsigned long long dst;  // x0
    void* v10;  // x8
    unsigned long long v11;  // x8
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x0
    unsigned long long v0;  // [bp-0x58]
    unsigned long long v1;  // [bp-0x50]
    void* v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a2 + 1;
    v6 = arm64g_calculate_condition(66, a2, 1, 0);
    if (!(v6 & 1))
    {
        ptr = _malloc(v5);
        if (ptr)
        {
            v8 = ptr;
            dst = _memcpy();
            v10 = a1 + 7 & 0xfffffffffffffff8;
            v11 = v10 - a1;
            if (v10 != a1)
            {
                v12 = 0;
                do
                {
                    if (!*((char *)a1 + v12))
                    {
                        a0->field_0 = v5;
                        a0->field_8 = v8;
                        a0->field_10 = a2;
                        a0->field_18 = v12;
                        return dst;
                    }
                } while ((v12 += 1, v11 != v12));
            }
            do
            {
            } while (!(~((0x101010101010100 - *(long long *)((char *)a1 + v11) | *(long long *)((char *)a1 + v11)) & (0x101010101010100 - *(long long *)((char *)a1 + v11 + 8) | *(long long *)((char *)a1 + v11 + 8))) & 0x8080808080808080) && (v11 += 16, v11 <= a2 - 16));
            if (a2 != v11)
            {
                v13 = 0;
                do
                {
                    if (!*((char *)a1 + v11 + v13))
                    {
                        a0->field_0 = v5;
                        a0->field_8 = v8;
                        a0->field_10 = a2;
                        a0->field_18 = v13 + v11;
                        return dst;
                    }
                } while ((v13 += 1, a2 - v11 != v13));
            }
            v0 = v5;
            v1 = v8;
            v2 = a2;
            v14 = sub_b71dcc(&v0);
            a0->field_8 = v14;
            a0->field_10 = a1;
            a0->field_0 = 0x8000000000000000;
            return v14;
        }
    }
    else
    {
        sub_c6ba88();
    }
    sub_c6b970(1, v5);
}
