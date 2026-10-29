/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb53680..0xb536d4 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b53680_0 {
    char padding_0[608];
    struct st_b53680_0 *field_260;
} st_b53680_0;


st_b53680_0 * sub_b53680(st_b53680_0 *a0, long long a1)
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
                goto LABEL_b536c8;
        }
        a0 = 1;
LABEL_b536c8:
    }
    return (unsigned int)a0;
}
