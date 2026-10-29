/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa66794..0xa66994 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a66794_0 {
    struct st_a66794_0 *field_0;
    char field_1;
    char padding_2[6];
    struct st_a66794_0 *field_8;
    unsigned long long field_10;
} st_a66794_0;

typedef struct st_a66794_2 {
    unsigned long long field_0;
} st_a66794_2;

typedef struct st_a66794_1 {
    struct st_a66794_0 *field_0;
    char padding_8[8];
    struct st_a66794_2 *field_10;
    struct st_a66794_0 *field_18;
    char padding_20[24];
    unsigned int field_38;
    unsigned int field_3c;
    struct st_a66794_0 *field_40;
    struct st_a66794_0 *field_44;
    unsigned long long field_48;
    char padding_50[8];
    unsigned long long field_58;
    struct st_a66794_0 *field_60;
} st_a66794_1;


st_a66794_0 * sub_a66794(st_a66794_1 *a0, unsigned long a1)
{
    unsigned long v2;  // x8
    unsigned long v3;  // x21
    st_a66794_0 *v12;  // x11
    unsigned long v4;  // x22
    st_a66794_0 *v5;  // w23
    st_a66794_0 *v6;  // w9
    unsigned long long v7;  // x24
    st_a66794_0 *v8;  // x0
    st_a66794_0 *v9;  // x8
    st_a66794_0 **v10;  // x10
    unsigned int v11;  // w9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    *(unsigned int *)&a0->field_58 = 0;
    v2 = a0->field_38;
    if (a0->padding_50 * 0x100 / v2 >= a0->field_44)
    {
        v3 = a0->field_3c;
        v4 = (int)a0->field_40;
        v5 = (st_a66794_0 *)*(int *)((char *)&a0->field_40 + 4);
        v6 = (st_a66794_0 *)((unsigned int)v4 + 1);
        if (v6 >= v5)
        {
            v7 = (unsigned int)v3 * 2;
            v8 = sub_a6c1b4(a0->field_0, (v7 * 8 | v7 >> 61) & 0x7fffffff8 & 0x7ffffffff, "crypto/lhash/lhash.c", 253);
            if (!v8)
            {
                *(int *)&a0->field_58 = (int)a0->field_58 + 1;
                return NULL;
            }
            a0->field_0 = v8;
            _bzero(&(&v8->field_0)[v3], v3 * 8);
            v6 = (st_a66794_0 *)0;
            *(unsigned int *)((char *)&a0->field_40 + 4) = v3;
            a0->field_3c = v7;
            v2 = a0->field_38;
        }
        *(unsigned int *)&a0->field_40 = (unsigned int)v6;
        a0->field_38 = (unsigned int)v2 + 1;
        v9 = a0->field_0;
        v10 = &(&v9->field_0)[v4];
        v11 = (unsigned int)(struct st_a66794_0 *)((char *)v5 + v4);
        (&v9->field_0)[v11] = 0;
        v12 = *v10;
        if (v12)
        {
            while (1)
            {
                if ((char *)v12->field_8 - v3 * v12->field_8 / v3 != v4)
                {
                    *v10 = *(long long *)&v12->field_1;
                    *(struct st_a66794_0 **)&v12->field_1 = (&v9->field_0)[v11];
                    (&v9->field_0)[v11] = v12;
                    v12 = *v10;
                    if (!v12)
                        break;
                }
                else
                {
                    v10 = &v12->field_1;
                    v12 = *v10;
                    if (!v12)
                        break;
                }
            }
        }
    }
    if (!a0->field_18)
        a0->field_10();
    a0->field_18();
}
