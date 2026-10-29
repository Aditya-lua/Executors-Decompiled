/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1eed2c..0x1eee04 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1eed2c_0 {
    char field_0;
} st_1eed2c_0;


void* sub_1eed2c(void* a0)
{
    unsigned long v4;  // x8
    unsigned long v5;  // x20
    unsigned int v6;  // w21
    unsigned int *iter;  // x10
    unsigned long v8;  // x11
    unsigned long v9;  // x11
    unsigned int v10;  // w13
    unsigned int v11;  // w12
    void* v12;  // x14
    void* v13;  // x8
    st_1eed2c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1eed2c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = (long long)a0[8];
    if (v4)
    {
        v5 = 0;
        v6 = 0;
        iter = *(long long *)a0 + 4;
        v8 = v4;
        do
        {
            v9 = v8;
            v10 = *(int *)((char *)iter - 4);
            v11 = *iter;
            if (v10 > v6)
            {
                v12 = *(long long *)a0 + v5 * 8;
                *(unsigned int *)v12 = v6;
                *(unsigned int *)&v12[4] = v10 - 1;
                v5 += 1;
            }
        } while ((v6 = v11 + 1, iter += 2, v8 = v9 - 1, v9 != 1));
        if (v6 >= 0x110000)
        {
            *(unsigned long *)&a0[8] = v5;
            return a0;
        }
    }
    else
    {
        v5 = 0;
        v6 = 0;
    }
    if (v5 >= v4)
    {
        sub_1fb5d8();
        a0 = a0;
    }
    v13 = *(long long *)a0 + v5 * 8;
    *(unsigned int *)v13 = v6;
    *(unsigned int *)&v13[4] = 0x10ffff;
    return a0;
}
