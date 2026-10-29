/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb164a0..0xb165a0 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b164a0(void* a0, long long a1)
{
    long long v4;  // x0
    unsigned long v5;  // x23
    unsigned long v6;  // x21
    unsigned long v7;  // x0
    unsigned long v8;  // x0
    unsigned int v9;  // w0
    unsigned long v0;  // [bp-0x50]
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9f2aec(*(long long *)a0);
    v5 = sub_a6fbc4(a1, "cipher");
    v6 = sub_a6fbc4(a1, "properties");
    v7 = sub_a6fbc4(a1, "save-parameters");
    if (v5)
    {
        v0 = 0;
        v1 = 0;
        if (!sub_a71bcc(v5, &v1) || v6 && !sub_a71bcc(v6, &v0) || !(sub_a4bbe4((long long)a0[16]), *(unsigned long long *)&a0[16] = 0, *(unsigned int *)&a0[12] = v1 != 0, !v1 || (v8 = sub_a4e104(v4), *(unsigned long *)&a0[16] = v8, v8)))
            return 0;
    }
    if (v7)
    {
        v9 = sub_a6fc2c();
        if (!v9)
            return v9;
    }
    return 1;
}
