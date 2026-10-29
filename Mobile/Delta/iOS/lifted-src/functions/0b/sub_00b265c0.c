/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb265c0..0xb26740 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_ee16e0[4];

unsigned long long sub_b265c0(unsigned long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long idx;  // x8
    unsigned long v4;  // x8
    long long v5;  // x1
    unsigned long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!a0 || !a1)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 393, "ecx_to_text");
        v5 = 786690;
        goto LABEL_b2666c;
    }
    idx = *(int *)(a1 + 96);
    if (3 >= (unsigned int)idx)
    {
        v4 = g_ee16e0[idx];
        if (!(a2 & 1))
            goto LABEL_b26684;
LABEL_b265f4:
        if (*(long long *)(a1 + 80))
        {
            v0 = v4;
            if ((int)sub_9d524c() >= 1 && sub_a2fd10(a0, "priv:", *(long long *)(a1 + 80), *(long long *)(a1 + 88)))
                return sub_a2fd10() != 0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 414, "ecx_to_text");
            v5 = 0xdd;
LABEL_b2666c:
            sub_a36abc(57, v5, 0);
        }
    }
    else
    {
        v4 = 0;
        if (a2 & 1)
            goto LABEL_b265f4;
LABEL_b26684:
        if (!(a2 >> 1 & 1))
            return sub_a2fd10() != 0;
        if (!(*(char *)(a1 + 16) & 1))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 425, "ecx_to_text");
            v5 = 220;
            goto LABEL_b2666c;
        }
        else
        {
            v0 = v4;
            if ((int)sub_9d524c() >= 1)
                return sub_a2fd10() != 0;
        }
    }
    return 0;
}
