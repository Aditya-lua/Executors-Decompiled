/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb507f0..0xb5085c (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b507f0_0 {
    char padding_0[28];
    char field_1c;
} st_b507f0_0;


unsigned long long sub_b507f0(st_b507f0_0 *a0)
{
    unsigned long v3;  // x9
    unsigned long long v4;  // x30
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a0)
        return 0;
    v3 = a0->field_1c;
    if (v3 & 1)
    {
        return 0;
    }
    else if (*(long long *)&a0[1].padding_0[11])
    {
        if (!(v3 >> 3 & 1))
        {
            v0 = &v2;
            v1 = v4;
            sub_a368c8();
            sub_a369bc("providers/implementations/signature/rsa_sig.c", 836, "rsa_signverify_message_update");
            sub_a36abc(57, 240, 0);
            return 0;
        }
        a0->field_1c = (char)v3 & 222;
    }
    else
    {
        return 0;
    }
}
