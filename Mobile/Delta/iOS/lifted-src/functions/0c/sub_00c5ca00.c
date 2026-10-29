/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5ca00..0xc5cafc (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5ca00_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c5ca00_0;


st_c5ca00_0 * sub_c5ca00(st_c5ca00_0 *a0, unsigned long long a1)
{
    unsigned long long i;  // x8
    unsigned long long v1;  // x11
    unsigned long long v10;  // x13
    st_c5ca00_0 *v11;  // x11
    st_c5ca00_0 *v12;  // x12
    unsigned long v13;  // x14
    unsigned long v14;  // x15
    uint128_t v15;  // q0
    st_c5ca00_0 *v2;  // x10
    unsigned long v3;  // x12
    uint128_t v4;  // q0
    unsigned long v5;  // x13
    unsigned long long v6;  // x10
    unsigned long long j;  // x12
    unsigned long long v8;  // x14
    unsigned long long v9;  // x13

    i = a1 + (a1 >> 1);
    do
    {
        i -= 1;
        v1 = i - a1;
        if (a1 > i)
        {
            v1 = 0;
            v2 = &a0[i];
            v3 = a0->field_10;
            v4 = a0->field_0;
            v5 = v2->field_10;
            a0->field_0 = v2->field_0;
            a0->field_10 = v5;
            v2->field_0 = v4;
            v2->field_10 = v3;
        }
        if (a1 < i)
            v6 = a1;
        else
            v6 = i;
        j = (1 | (v1 * 2 | v1 >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
        if (v6 > j)
        {
            v8 = v1 * 2;
            do
            {
                v9 = v8 + 2;
                if (v6 > v9)
                {
                    if (a0[v9].field_10 <= a0[j].field_10)
                        v10 = j;
                    else
                        v10 = j + 1;
                    v11 = &a0[v1];
                    v12 = &a0[v10];
                    v13 = v11->field_10;
                    v14 = v12->field_10;
                    if (v13 >= v14)
                        break;
                }
                else
                {
                    v10 = j;
                    v11 = &a0[v1];
                    v12 = &a0[j];
                    v13 = v11->field_10;
                    v14 = v12->field_10;
                    if (v14 <= v13)
                        break;
                }
                v15 = v11->field_0;
                v11->field_0 = v12->field_0;
                v12->field_0 = v15;
                v11->field_10 = v14;
                v12->field_10 = v13;
                v8 = v10 * 2;
                j = (1 | (v10 * 2 | v10 >> 63) & 0x7ffffffffffffffe) & 0x7fffffffffffffff;
                v1 = v10;
            } while (j < v6);
        }
    } while (i);
    return a0;
}
