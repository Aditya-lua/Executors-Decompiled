/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61a4c..0xc61b44 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d28450;

void* sub_c61a4c(void* a0, unsigned long long a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    void* v19;  // x0
    unsigned long long v11;  // x22
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    void* v16;  // x23
    void* v17;  // x0
    void* v18;  // x22
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (1 << ((char)a1 & 31) & 15 & (unsigned int)((int)a0[1568]) >> 20 & 15)
        return a0;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    sub_98b8b8((long long)a0[216]);
    sub_9838e0((long long)a0[1064], a1);
    sub_9853f4((long long)a0[1056], a1);
    if (3 >= (unsigned int)a1)
    {
        goto *((void *)(sub_c61acc + (&g_d28450)[a1 & 0xffffffff] * 4));
    }
    else
    {
        sub_9754a0((long long)a0[1048], 2);
        v16 = a0 + 1096;
        v17 = (long long)v16[16];
        if (!v17)
            return v17;
        v18 = a0 + 1120;
        if (!(long long)v18[16])
            return v17;
        sub_988ae8();
        *(unsigned long long *)&v16[16] = 0;
        v19 = sub_9860e8((long long)v18[16]);
        *(unsigned long long *)&v18[16] = 0;
        *(unsigned long long *)&a0[1568] = (long long)a0[1568] & 0xffffffffff0fffff | (0x100000 << ((char)a1 & 31) | (int)(long long)a0[1568]) & 0xf00000;
        return v19;
    }
}
