/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa43808..0xa43910 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a43808(unsigned long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long idx;  // x20
    unsigned long long v4;  // w0
    long long v5;  // x23
    unsigned long long v6;  // x0
    unsigned long long v7;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9ffdd8();
    if (!a1 && !a2)
        return 1;
    idx = v2;
    if (a1)
    {
        v4 = (unsigned int)sub_a50904(a0);
        if (v4 < 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/e_aes.c", 3683, "aes_wrap_init_key");
            sub_a36abc(6, 130, 0);
            return 0;
        }
        v5 = v4 * 8;
        if (sub_a50720(a0))
        {
            sub_9b8880(a1, v5, idx);
            if (!a2)
                goto LABEL_a438f4;
LABEL_a438c4:
            v6 = sub_a4fbf0(a0);
            if (v6 >> 31 & 1)
                return 0;
            v7 = a0 + 40;
            _memcpy(v7, a2, v6 & 0xffffffff);
            *(unsigned long long *)(idx + 248) = v7;
        }
        else
        {
            sub_9b8ba4(a1, v5, idx);
            if (a2)
                goto LABEL_a438c4;
LABEL_a438f4:
            *(unsigned long long *)(idx + 248) = 0;
        }
    }
    else if (a2)
    {
        goto LABEL_a438c4;
    }
    return 1;
}
