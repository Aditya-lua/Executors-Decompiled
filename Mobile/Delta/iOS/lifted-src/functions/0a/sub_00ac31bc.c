/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac31bc..0xac3304 (328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ac31bc(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long *a6)
{
    unsigned long long v12;  // x26
    unsigned long long v13;  // x25
    long long v22;  // x19
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long long v16;  // x22
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    long long v21;  // x24
    char v0;  // [bp-0x88]
    unsigned long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    if (!a4)
    {
        *a6 = a1;
        return a0;
    }
    else if ((unsigned long long)a3 > 0xff)
    {
        return 0;
    }
    else
    {
        v1 = v12;
        v2 = v13;
        v3 = v14;
        v4 = v15;
        v5 = v16;
        v6 = v17;
        v7 = v18;
        v8 = v19;
        v9 = &v11;
        v10 = v20;
        v21 = a1 + a3 + 2;
        if ((unsigned long long)v21 < (unsigned long long)a1)
            return 0;
        *a6 = v21;
        v22 = a5;
        if ((unsigned long long)v21 >= 1025)
        {
            v22 = sub_a6bffc(v21, "crypto/slh_dsa/slh_dsa.c", 267);
            if (!v22)
                return v22;
        }
        if (sub_c68800(&v0, v22, v21, 0) && sub_c68d5c(&v0, 0, 1) && sub_c68d5c(&v0, a3, 1) && sub_a6ebd4(&v0, a2, a3) && sub_a6ebd4(&v0, a0, a1) && sub_a6eaf8(&v0))
            return v22;
        if (v22 != a5)
            sub_a6c2e4(v22, "crypto/slh_dsa/slh_dsa.c", 278);
        sub_a6ed4c(&v0);
        return 0;
    }
}
