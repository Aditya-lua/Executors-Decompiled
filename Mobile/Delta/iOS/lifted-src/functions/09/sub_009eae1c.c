/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eae1c..0x9eaf10 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_9eae1c(unsigned long long *a0, long long *a1, unsigned long long a2, long long a3)
{
    unsigned long long v13;  // x28
    unsigned long long v14;  // x27
    unsigned long long v23;  // x30
    long long v24;  // x20
    unsigned long v25;  // x24
    unsigned long long *v26;  // x25
    unsigned long long *iter;  // x27
    unsigned long v28;  // x26
    unsigned long v29;  // x24
    unsigned long long v15;  // x26
    unsigned long long v16;  // x25
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    unsigned long long v19;  // x22
    unsigned long long v20;  // x21
    unsigned long long v21;  // x20
    unsigned long long v22;  // x19
    unsigned long long v0;  // [bp-0x60]
    unsigned long long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    v0 = v13;
    v1 = v14;
    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = &v12;
    v11 = v23;
    v24 = (unsigned int)a2 * 2;
    *(unsigned long long *)((char *)&a0[v24] - 8) = 0;
    *a0 = 0;
    if ((int)a2 >= 2)
    {
        a0[a2] = sub_9db7cc(a0 + 1, a1 + 1, (unsigned int)a2 - 1, *a1);
        v25 = (unsigned int)a2 - 2;
        if ((unsigned int)a2 != 2)
        {
            v26 = a0 + 3;
            iter = &a0[(a2 & 0xffffffff) + 1];
            v28 = a1 + 2;
            do
            {
                v29 = v25;
                *iter = sub_9db6d0(v26, v28, v29, *(long long *)(v28 - 8));
                iter += 1;
                v26 += 2;
                v28 += 8;
                v25 = (unsigned int)v29 - 1;
            } while (1 < (unsigned int)v29);
        }
    }
    sub_9dbad4(a0, a0, a0, v24);
    sub_9db89c(a3, a1, a2);
    sub_9dbad4();
    return;
}
