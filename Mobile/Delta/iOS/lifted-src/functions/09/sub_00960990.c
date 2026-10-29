/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x960990..0x960a40 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_960990_1 {
    int field_0;
    char padding_4[108];
    unsigned long long field_70;
    char padding_78[96];
    struct st_960990_0 *field_d8;
} st_960990_1;

typedef struct st_960990_2 {
    char padding_0[24];
    struct st_960990_1 *field_18;
    char padding_20[2451];
    char field_9b3;
    char padding_9b4[492];
    unsigned int field_ba0;
} st_960990_2;

typedef struct st_960990_0 {
    char padding_0[80];
    char field_50;
} st_960990_0;


char sub_960990(st_960990_2 *a0)
{
    st_960990_1 *v2;  // x8
    long long v3;  // x19
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        return 0;
    }
    else if (!*(int *)&a0->padding_0[0])
    {
        v2 = a0->field_18;
        if (!(v2->field_d8->field_50 >> 3 & 1) && v2->field_0 >= 772 && v2->field_0 != 0x10000)
        {
            v3 = 266;
            v4 = 2862;
        }
        else if (!(a0->field_9b3 >> 6 & 1))
        {
            a0->field_ba0 = 1;
            *(unsigned int *)&a0->padding_20[92] = 0;
            goto *((void *)(v2->field_70));
        }
        else
        {
            v3 = 339;
            v4 = 2867;
        }
        sub_a368c8();
        sub_a369bc("ssl/ssl_lib.c", v4, "can_renegotiate");
        sub_a36abc(20, v3, 0);
        return 0;
    }
    else
    {
        return 0;
    }
}
