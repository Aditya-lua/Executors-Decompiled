/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb16098..0xb162dc (580 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b16098(unsigned long a0, long long a1, unsigned long a2, unsigned long long *a3, unsigned long a4, unsigned long a5, unsigned long a6, unsigned long a7)
{
    unsigned long v26;  // x23
    unsigned long v28;  // x19
    uint128_t v0;  // [bp-0x1c8]
    uint128_t v1;  // [bp-0x1b8]
    unsigned long long v2;  // [bp-0x1a8]
    unsigned int v3;  // [bp-0x19c]
    unsigned long v4;  // [bp-0x198]
    unsigned long v5;  // [bp-0x190]
    unsigned long v6;  // [bp-0x188]
    uint128_t v7;  // [bp-0x158]
    uint128_t v8;  // [bp-0x148]
    unsigned long long v9;  // [bp-0x138]
    uint128_t v10;  // [bp-0x130]
    uint128_t v11;  // [bp-0x120]
    unsigned long long v12;  // [bp-0x110]
    uint128_t v13;  // [bp-0x108]
    uint128_t v14;  // [bp-0xf8]
    unsigned long long v15;  // [bp-0xe8]
    uint128_t v16;  // [bp-0xe0]
    uint128_t v17;  // [bp-0xd0]
    unsigned long long v18;  // [bp-0xc0]
    uint128_t v19;  // [bp-0xb8]
    uint128_t v20;  // [bp-0xa8]
    unsigned long long v21;  // [bp-0x98]
    unsigned int v22;  // [bp-0x8c]
    unsigned long v23;  // [bp-0x58]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v5 = 0;
    v6 = a0;
    v4 = 0;
    v3 = 2;
    v26 = sub_afafac(&v6);
    if (!v26)
    {
        v28 = 1;
    }
    else if (sub_afbf08(0, 0, 0, &v5, v26))
    {
        sub_9cf830(&v4, 0, 0, v5);
        if (sub_a99eac(v4) == 408 && sub_a17b90(v5))
        {
            v22 = 3296595;
        }
        else if ((int)sub_a99b48(&v22, 50, v4, 0) < 1)
        {
            goto LABEL_b16294;
        }
        sub_afb020(v26);
        sub_a71618("data-type", &v22, 0);
        sub_a71618("input-type", "DER", 0);
        v7 = v0;
        v8 = v1;
        v9 = v2;
        sub_a71618("data-structure", "SubjectPublicKeyInfo", 0);
        v10 = v0;
        v11 = v1;
        v12 = v2;
        sub_a71670("data", a0, a1);
        v13 = v0;
        v14 = v1;
        v15 = v2;
        v16 = v0;
        v17 = v1;
        v18 = v2;
        sub_a71bbc(sub_a6ffac("type", &v3), &v3);
        v19 = v0;
        v20 = v1;
        v21 = v2;
        a3();
    }
    else
    {
LABEL_b16294:
        v28 = 0;
    }
    sub_afb020(v26);
    if (*(long long *)&g_10002b0 == v23)
        return v28;
    ___stack_chk_fail();
}
