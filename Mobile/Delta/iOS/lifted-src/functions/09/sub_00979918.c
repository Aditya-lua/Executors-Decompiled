/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x979918..0x979a44 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_979918(void* a0, void* a1, unsigned int a2, unsigned int a3)
{
    unsigned long long v2;  // x23
    unsigned int v3;  // w24
    unsigned int v4;  // x0
    unsigned int v5;  // x0
    unsigned int v6;  // w24
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)a1[0x100];
    v3 = (int)a0[1568];
    if ((!a2 || (v4 = sub_988a4c(0x2000), *(unsigned long long *)&a1[112] = v4, v4)) && (!a3 || (v5 = sub_985e50(0, 0, 0), *(unsigned long long *)&a1[120] = v5, v5)) && sub_97ba4c(a1 + 128, a0 + 240))
    {
        v6 = (unsigned int)v2 ^ v3 >> 25;
        if (a2 && (unsigned long long)((long long)a0[1568]) >> 7 & 1)
            sub_97ba78();
        if (sub_97bb34(a1 + 160, a0 + 272))
            return 1;
    }
    sub_988ae8((long long)a1[112]);
    *(unsigned long long *)&a1[112] = 0;
    sub_9860e8((long long)a1[120]);
    *(unsigned long long *)&a1[120] = 0;
    return 0;
}
