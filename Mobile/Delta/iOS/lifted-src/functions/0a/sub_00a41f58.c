/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa41f58..0xa420b0 (344 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a41f58_0 {
    char padding_0[248];
    long long field_f8;
} st_a41f58_0;


int sub_a41f58(long long a0, long long a1, long long a2, long long a3)
{
    long long i;  // x23
    long long v6;  // x21
    long long v7;  // x20
    st_a41f58_0 *v8;  // x22
    long long v9;  // x0
    long long v10;  // x0
    long long v11;  // x0
    unsigned int v0;  // [bp-0x5c]
    unsigned int v1;  // [bp-0x58]
    unsigned int v2;  // [bp-0x54]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    i = a3;
    v6 = a2;
    v7 = a1;
    v8 = sub_9ffdd8();
    if (sub_a50de8(a0, 0x2000))
    {
        v2 = sub_a507d0(a0);
        v9 = sub_a50720(a0);
        sub_a94388(v6, v7, i, v8, a0 + 40, &v2, v9, v8->field_f8);
    }
    else
    {
        if ((unsigned long long)i > 0xfffffffffffffff)
        {
            do
            {
                v1 = sub_a507d0(a0);
                v10 = sub_a50720(a0);
                sub_a94388(v6, v7, -0x8000000000000000, v8, a0 + 40, &v1, v10, v8->field_f8);
                sub_a50868(a0, v1);
                i += 0xf000000000000000;
                v7 += 0x1000000000000000;
                v6 += 0x1000000000000000;
            } while ((unsigned long long)i > 0xfffffffffffffff);
        }
        if (!i)
            return 1;
        v0 = sub_a507d0(a0);
        v11 = sub_a50720(a0);
        sub_a94388(v6, v7, i * 8, v8, a0 + 40, &v0, v11, v8->field_f8);
    }
    sub_a50868(a0);
    return 1;
}
