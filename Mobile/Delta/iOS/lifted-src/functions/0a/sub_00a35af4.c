/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa35af4..0xa35bc0 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_a35af4(void)
{
    void* v2;  // x0
    void* iter;  // x21
    unsigned long long i;  // x22
    void* node;  // x24
    char v6;  // x22
    char v7;  // w8
    void* v8;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a35bc0();
    if (!v2)
        return v2;
    iter = v2 + 384;
    i = 16;
    node = v2;
    do
    {
        v6 = i;
        if (!((char)node[0x200] & 1))
        {
            v7 = 0;
            *(unsigned long long *)((char *)iter - 128) = 0;
            *(unsigned long long *)iter = 0;
        }
        else
        {
            if (!*(long long *)((char *)iter - 128))
                continue;
            *(char *)*(long long *)((char *)iter - 128) = 0;
            v7 = 1;
        }
        *(unsigned int *)&node[0x200] = v7;
        *(unsigned int *)&node[64] = 0;
        *(unsigned int *)node = 0;
        *(unsigned long long *)((char *)iter - 0x100) = 0;
        *(unsigned int *)&node[704] = 0xffffffff;
        sub_a6c2e4((long long)iter[192], "crypto/err/err_local.h", 92);
        *(unsigned long long *)&iter[192] = 0;
        v8 = sub_a6c2e4((long long)iter[384], "crypto/err/err_local.h", 94);
        *(unsigned long long *)&iter[384] = 0;
        iter += 8;
        node += 4;
        i = v6 - 1;
    } while (i);
    *(unsigned long long *)&v2[896] = 0;
    return v8;
}
