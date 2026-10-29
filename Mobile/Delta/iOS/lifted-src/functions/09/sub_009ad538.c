/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ad538..0x9ad5b0 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ad538_1 {
    char padding_0[1264];
    struct st_9ad538_0 *field_4f0;
} st_9ad538_1;

typedef struct st_9ad538_3 {
    char padding_0[8];
    struct st_9ad538_2 *field_8;
} st_9ad538_3;

typedef struct st_9ad538_0 {
    char padding_0[288];
    long long field_120;
} st_9ad538_0;

typedef struct st_9ad538_2 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[22];
    unsigned int field_28;
} st_9ad538_2;


int sub_9ad538(st_9ad538_1 *a0)
{
    st_9ad538_3 *v4;  // x0
    char v0;  // [bp-0x2c]
    unsigned long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = sub_954340(a0->field_4f0->field_120);
    while (1)
    {
        v4 = sub_9543a4(&v1);
        if (!v4)
        {
            return 1;
        }
        else if (1 > (int)sub_9ad5b0(a0, v4->field_8->field_10 * 2 - v4->field_8->field_28 & 0xffff, &v0))
        {
            return -0x1;
        }
    }
}
