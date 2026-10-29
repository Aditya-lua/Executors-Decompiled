/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954044..0x954120 (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_954044_1 {
    struct st_954044_1 *field_0;
    struct st_954044_0 *field_8;
    char padding_10[72];
    long long field_58;
    char padding_60[356];
    struct st_954044_1 *field_1c4;
    unsigned short field_1c8;
    char padding_1ca[814];
    struct st_954044_1 *field_4f8;
    char padding_500[1120];
    struct st_954044_1 *field_960;
} st_954044_1;

typedef struct st_954044_0 {
    char padding_0[288];
    struct st_954044_1 *field_120;
} st_954044_0;


st_954044_1 * sub_954044(st_954044_1 *a0)
{
    unsigned long long v7;  // x20
    unsigned long long v8;  // x19
    unsigned long long v9;  // x30
    st_954044_1 *v10;  // x0
    st_954044_1 *v11;  // x8
    char v0;  // [bp-0x30]
    unsigned short v1;  // [bp-0x22]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    v2 = v7;
    v3 = v8;
    v4 = &v6;
    v5 = v9;
    if ((int)a0->field_0)
    {
        v10 = 0;
    }
    else
    {
        *(unsigned int *)&(a0->padding_60)[1] = 0;
        v1 = (short)a0->field_1c4;
        v10 = sub_991cec(a0, 21, &v1, 2, &v0);
        if ((int)(unsigned int)v10 > 0)
        {
            sub_9d46fc(a0->field_58, 11, 0, 0);
            if (*(long long *)&a0->padding_1ca[806])
                (*(long long *)&a0->padding_1ca[806])();
            v11 = *(long long *)&a0->padding_500[1112];
            if (*(long long *)&a0->padding_500[1112] || !(v11 = a0->field_8->field_120, !v11))
                v11();
        }
        else
        {
            *(unsigned int *)&(a0->padding_60)[1] = 1;
        }
    }
    return v10;
}
