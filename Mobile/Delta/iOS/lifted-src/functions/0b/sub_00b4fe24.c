/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4fe24..0xb4fe78 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4fe24_0 {
    char padding_0[592];
    struct st_b4fe24_0 *field_250;
} st_b4fe24_0;


st_b4fe24_0 * sub_b4fe24(st_b4fe24_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a0)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (sub_a6fbc4(a1, "algorithm-id"))
        {
            a0 = sub_a715c0();
            if (!(unsigned int)a0)
                goto LABEL_b4fe6c;
        }
        a0 = 1;
LABEL_b4fe6c:
    }
    return (unsigned int)a0;
}
