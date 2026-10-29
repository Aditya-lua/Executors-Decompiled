/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc28314..0xc283e4 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c28314(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // x24
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    unsigned long v16;  // x20
    unsigned long long n;  // x23
    unsigned long long v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    v16 = a1[1];
    n = a1[3] - v16;
    v18 = 1117984489315730401 * (n >> 3);
    v19 = a0[2];
    if (*a0 - v19 < v18)
    {
        sub_c736c8(a0, v19, v18, 8, 264);
        v19 = a0[2];
    }
    else if (a1[3] == v16)
    {
        goto LABEL_c28388;
    }
    _memcpy(a0[1] + 264 * v19, v16, n);
LABEL_c28388:
    a0[2] = v19 + v18;
    a1[3] = v16;
    sub_c397b0();
    return;
}
