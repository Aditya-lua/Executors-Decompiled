/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x988ef0..0x989068 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_988ef0_0 {
    unsigned long long field_0[2];
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    unsigned long long field_18;
    char field_20;
    char padding_21[47];
    char field_50;
} st_988ef0_0;


char sub_988ef0(st_988ef0_0 *a0, unsigned long a1, char a2)
{
    unsigned long long v8;  // x21
    char v9;  // x25
    char v18;  // x26
    char v19;  // x8
    unsigned long long v20;  // x24
    unsigned long long v21;  // x11
    unsigned long long v22;  // x12
    unsigned long long v23;  // x12
    char v24;  // w0
    unsigned long v10;  // x9
    unsigned long v11;  // x10
    unsigned long v12;  // x8
    char v14;  // x21
    char v15;  // x10
    char v16;  // x11
    char i;  // x19
    unsigned long v0;  // [bp-0x98]
    unsigned long v1;  // [bp-0x90]
    char *v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x80]
    unsigned long v4;  // [bp-0x70]
    unsigned long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v3 = (uint128_t)a0->field_0;
    if (!(a0->padding_21[39] & 1))
    {
        v8 = a2;
        if (a2)
        {
            v9 = 0;
            v10 = *(long long *)&a0->field_8;
            v11 = a0->field_10;
            v12 = a0->field_0[1];
            v0 = v11;
            v1 = v10;
            do
            {
                v14 = v8;
                v15 = v12 - v10 + v11;
                if (v14 < v15)
                    v15 = v14;
                v16 = 0x4000000000000000 - v10;
                if (v15 < v16)
                    i = v15;
                else
                    i = v16;
                if (!i)
                    break;
                v18 = 0;
                do
                {
                    v19 = v12 - (v10 - v12 * v10 / v12);
                    if (i < v19)
                        v20 = i;
                    else
                        v20 = v19;
                    _memcpy();
                    v12 = a0->field_0[1];
                    v10 = *(long long *)&a0->field_8 + v20;
                    *(unsigned long *)&a0->field_8 = v10;
                    v21 = i - v20;
                    v18 += v20;
                    v11 = a0->field_10;
                    v22 = v12 - v10 + a0->field_10;
                    if (v21 >= v22)
                        v21 = v22;
                    v23 = 0x4000000000000000 - v10;
                    if (v21 < v23)
                        i = v21;
                    else
                        i = v23;
                } while (i);
            } while (v18 && (v9 += v18, v8 = v14 - v18, v14 != v18));
            if (!v9 || (v4 = v1, v5 = v4 + v9 - 1, v24 = sub_c63d0c(&a0->field_18, &v4), v24))
            {
                v24 = 1;
            }
            else
            {
                v9 = 0;
                *(uint128_t *)a0->field_0 = v3;
                *(unsigned long *)&a0->field_8 = v4;
                a0->field_10 = v0;
            }
        }
        else
        {
            v9 = 0;
            v24 = 1;
        }
    }
    else
    {
        v9 = 0;
        v24 = 0;
    }
    *(unsigned long long *)v2 = v9;
    return v24;
}
