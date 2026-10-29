/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68910..0xc689b0 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68910_0 {
    char padding_0[16];
    struct st_c68910_0 *field_10;
    struct st_c68910_0 *field_18;
} st_c68910_0;


void sub_c68910(st_c68910_0 **a0, st_c68910_0 *a1, st_c68910_0 *a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // 4168
    st_c68910_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        *a0 = a1;
        a0[1] = 0;
        v8 = arm64g_calculate_condition(0x22, (struct st_c68910_0 *)((char *)a2 - 8), 7, 0);
        v9 = sub_a6ee20(sub_a6ee60(), "crypto/packet.c");
        a0[5] = v9;
        if (v9)
        {
            if (!a2)
            {
LABEL_c6896c:
            }
            else
            {
                v9->field_10 = a2;
                v9->field_18 = a2;
                if (sub_a6ee10())
                {
                    sub_a6ee44();
                    goto LABEL_c6896c;
                }
                else
                {
                    sub_a6c2e4(a0[5], "crypto/packet.c", 120);
                    a0[5] = 0;
                }
            }
        }
    }
}
