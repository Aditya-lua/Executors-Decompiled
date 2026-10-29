/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb35e90..0xb35f80 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_b35e90(long long a0, long long a1, long long a2, unsigned long a3, unsigned int a4)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // 4184
    unsigned long v4;  // x8
    unsigned long long v5;  // x22
    unsigned long long v6;  // 4196
    long long v7;  // x0
    long long v8;  // x23
    long long v9;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a1ad1c(sub_9ffdd0());
    v3 = arm64g_calculate_condition(177, v2, 7, 0);
    v4 = (v3 & 1 ? v2 + 14 : v2 + 7);
    v5 = (long long)(v4 * 0x100000000) >> 63 & 0xffffffffe0000000 | __ROL__(v4, 61) & 0xe00000001fffffff & 0x1fffffff;
    v6 = arm64g_calculate_condition((v5 == a4 ? 4 : 0) | 144, (v5 == a4 ? v5 : 0x20000000), (v5 == a4 ? a3 : 0), 0);
    if (!(v6 & 1))
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/kem/ec_kem.c", 529, "generate_ecdhkm");
        sub_a36abc(57, 142, "secretsz invalid");
    }
    else
    {
        v7 = sub_9dddcc(sub_a19700(a1));
        if (!v7)
            return v7;
        v8 = v7;
        v9 = (unsigned int)sub_a19308(a1, v8);
        sub_9dded4(v8);
        if (v9)
            return (int)sub_a19e9c(a2, v5, sub_975ff4(a1), a0, 0) > 0;
    }
    return 0;
}
