/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa6a3c..0xaa6bd0 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa6a3c_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_aa6a3c_0;


void* sub_aa6a3c(long long a0, long long a1)
{
    void* v3;  // w21
    void* v4;  // x22
    unsigned long v13;  // x8
    unsigned long v14;  // x8
    unsigned int v5;  // w23
    st_aa6a3c_0 *v6;  // x0
    unsigned long long v7;  // x8
    unsigned int v8;  // w25
    unsigned long v9;  // x23
    unsigned int *iter;  // x27
    void* v11;  // x24
    st_aa6a3c_0 *v12;  // x0
    unsigned long long v0;  // [bp-0x70]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (void*)(unsigned int)sub_ad69e4(a1);
    v4 = sub_a6bf4c();
    if (!v4)
        return v4;
    sub_ad6ae4(a1);
    v5 = (char)v4[4] & 0xfffffffe;
    *(char *)&v4[4] = v5;
    if (v3 >= 1)
    {
        v6 = sub_ad69f8(a1, 0);
        v7 = v6->field_10;
        *(uint128_t *)&v4[8] = v6->field_0;
        *(unsigned long long *)&v4[24] = v7;
        v8 = (char)v4[20] & 1 | v5;
        *(char *)&v4[4] = v8;
        if (v3 != 1)
        {
            v9 = (int)v4[8];
            iter = v4 + 32;
            v11 = 1;
            do
            {
                v12 = sub_ad69f8(a1, v11);
                v13 = v12->field_10;
                *(uint128_t *)iter = v12->field_0;
                *(unsigned long *)&iter[4] = v13;
                v8 |= (char)iter[3] & 1;
                *(char *)&v4[4] = v8;
                v14 = *iter;
                if ((unsigned int)v14 == (unsigned int)v9)
                {
                    sub_a368c8(sub_a6c2e4(v4, "crypto/property/property_parse.c", 332), "crypto/property/property_parse.c", 332);
                    sub_a369bc("crypto/property/property_parse.c", 333, "stack_to_property_list");
                    v0 = sub_aa7d48(a0, v9);
                    sub_a36abc(55, 108, "Duplicated name `%s'");
                    return 0;
                }
            } while ((iter += 6, v11 += 1, v9 = v14, v3 != v11));
        }
    }
    *(unsigned int *)v4 = (unsigned int)v3;
    return v4;
}
