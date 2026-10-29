/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x969758..0x969808 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_969758_2 {
    char padding_0[1616];
    struct st_969758_1 *field_650;
    struct st_969758_1 *field_658;
    struct st_969758_0 *field_660;
    struct st_969758_1 *field_668;
} st_969758_2;

typedef struct st_969758_1 {
    unsigned short field_0;
} st_969758_1;

typedef struct st_969758_3 {
    char padding_0[8];
    struct st_969758_2 *field_8;
    char padding_10[2160];
    struct st_969758_4 *field_880;
} st_969758_3;

typedef struct st_969758_0 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[10];
    unsigned int field_1c;
    char padding_20[8];
    struct st_969758_1 *field_28;
    struct st_969758_1 *field_2c;
} st_969758_0;

typedef struct st_969758_4 {
    char padding_0[64];
    struct st_969758_1 *field_40;
    struct st_969758_1 *field_48;
} st_969758_4;


unsigned short * sub_969758(st_969758_3 *a0, unsigned short *a1)
{
    unsigned short *v0;  // x8
    unsigned short *v1;  // x9
    unsigned short *v2;  // x10
    unsigned short *v3;  // x12
    st_969758_1 **v4;  // x13
    unsigned short *v5;  // x15
    unsigned short *v6;  // x15

    v0 = a0->field_880->field_40;
    if (a0->field_880->field_40)
    {
        v1 = a0->field_880->field_48;
        if (!a0->field_880->field_48)
            return 0;
    }
    else
    {
        v0 = a0->field_8->field_668;
        v1 = a0->field_8->field_658;
        if (!a0->field_8->field_658)
            return 0;
    }
    v2 = 0;
    v3 = a0->field_8->field_650;
    do
    {
        if (a0->field_8->field_650)
        {
            v4 = (char *)&a0->field_8->field_660->field_28 + 4;
            v5 = v3;
            do
            {
                v6 = v5;
                if (*(short *)((char *)v4 - 28) == *(short *)((char *)v0 + 0x2 * v2) && *(int *)v4 && *(int *)((char *)v4 - 16) == 408 && *(int *)((char *)v4 - 4))
                {
                    if (*(int *)((char *)v4 - 4) == a1)
                        return 1;
                    break;
                }
            } while ((v4 += 9, v5 = (char *)v6 - 1, v6 != 1));
        }
    } while ((v2 = (char *)v2 + 1, v2 != v1));
    return 0;
}
