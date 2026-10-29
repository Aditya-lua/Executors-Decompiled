/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68800..0xc688bc (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68800_0 {
    char padding_0[16];
    struct st_c68800_0 *field_10;
    struct st_c68800_0 *field_18;
} st_c68800_0;

typedef struct st_c68800_1 {
    struct st_c68800_0 *field_0;
    struct st_c68800_0 *field_8;
    struct st_c68800_0 *field_10;
    struct st_c68800_0 *field_18;
    struct st_c68800_0 *field_20;
    struct st_c68800_0 *field_28;
    char field_30;
} st_c68800_1;


void sub_c68800(st_c68800_1 *a0, st_c68800_0 *a1, st_c68800_0 *a2, st_c68800_0 *a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // 4135
    st_c68800_0 *v9;  // x8
    st_c68800_0 *v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a1 && a2)
    {
        v8 = arm64g_calculate_condition(0x22, (struct st_c68800_0 *)((char *)a3 - 8), 7, 0);
        if (v8 & 1)
            v9 = &a3->padding_0[~(0xffffffffffffffff << ((char)a3 * 8 & 63))];
        else
            v9 = 0xffffffffffffffff;
        a0->field_0 = 0;
        a0->field_8 = a1;
        if (v9 >= a2)
            v9 = a2;
        a0->field_18 = 0;
        a0->field_20 = v9;
        a0->field_30 = a0->field_30 & 254;
        a0->field_10 = 0;
        v10 = sub_a6ee20();
        a0->field_28 = v10;
        if (v10)
        {
            if (!a3)
            {
LABEL_c6887c:
            }
            else
            {
                v10->field_10 = a3;
                v10->field_18 = a3;
                if (sub_a6ee10())
                {
                    sub_a6ee44();
                    goto LABEL_c6887c;
                }
                else
                {
                    sub_a6c2e4(a0->field_28, "crypto/packet.c", 120);
                    a0->field_28 = 0;
                }
            }
        }
    }
}
