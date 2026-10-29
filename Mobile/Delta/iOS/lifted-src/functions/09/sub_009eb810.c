/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eb810..0x9eb8c0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9eb810_0 {
    unsigned long long field_0;
    unsigned int field_8;
} st_9eb810_0;


unsigned long long sub_9eb810(st_9eb810_0 *a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    unsigned long v4;  // x9
    unsigned long long v5;  // x0
    unsigned long i;  // x8
    unsigned long long *v7;  // x9
    unsigned long long *v8;  // x9
    unsigned long long v9;  // x11
    unsigned long v10;  // x11
    unsigned long long v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        return 0xffffffffffffffff;
    if (a1 >= 4294967297)
    {
        v2 = sub_9e4b00();
        if (v2)
        {
            v3 = sub_9eb8c0();
            sub_9e48d4(v2);
            return v3;
        }
    }
    else
    {
        v4 = a0->field_8;
        if ((int)v4 < 1)
            return 0;
        v5 = 0;
        i = v4 + 1;
        v7 = a0->field_0 + v4 * 8 - 8;
        do
        {
            v8 = (char *)v7 - 8;
            v9 = v5 * 0x100000000 | *v7 >> 32;
            v10 = (unsigned int)v9 - (unsigned int)a1 * (unsigned int)(v9 / a1);
            v11 = *v7 & 0xffffffff | (v10 * 0x100000000 | v10 >> 32) & 0xffffffff00000000;
            v5 = v11 - a1 * v11 / a1;
            i -= 1;
            v7 = v8;
        } while (1 < i);
        return v11 - a1 * v11 / a1;
    }
    return 0xffffffffffffffff;
}
