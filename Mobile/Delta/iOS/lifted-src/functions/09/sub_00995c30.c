/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x995c30..0x995d0c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_995c30(long long a0, void* a1)
{
    unsigned int v2;  // w9
    unsigned long v3;  // x8
    long long v12;  // x10
    unsigned long v4;  // cc_dep1
    unsigned long long v5;  // 4110
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    long long v9;  // x1
    long long v10;  // x2
    void* v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (int)a1[4];
    v3 = (long long)a1[8];
    v4 = v2;
    switch (v2)
    {
    case 21:
LABEL_995cb0:
        if (v3 <= 0x4000)
            return sub_998344() != 0;
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls13_meth.c", 302, "tls13_post_process_record");
        v9 = 22;
        v10 = 146;
        break;
    case 23:
        v5 = arm64g_calculate_condition(3, v4, 21, 0);
        v6 = arm64g_calculate_condition(20, (v5 & 1 ? v3 : 0x40000000), 0, 0);
        if (v6 & 1)
            goto LABEL_995c88;
LABEL_995c58:
        sub_a368c8();
        sub_a369bc("ssl/record/methods/tls13_meth.c", 289, "tls13_post_process_record");
        v9 = 10;
        v10 = 443;
        break;
    default:
        v7 = arm64g_calculate_condition(3, v4, 21, 0);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? v3 : 0x40000000), 0, 0);
        if (!(v8 & 1))
            goto LABEL_995c58;
LABEL_995c88:
        v11 = (long long)a1[32];
        v12 = v3 - 1;
        do
        {
            v3 = v12;
        } while (v12 && (v12 = v3 - 1, !*((char *)v11 + v3)));
        *(unsigned long *)&a1[8] = v3;
        *(unsigned int *)&a1[4] = *((char *)v11 + v3);
        goto LABEL_995cb0;
    }
    sub_996e84(a0, v9, v10, 0);
    return 0;
}
