/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb09ce4..0xb09d8c (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b09ce4_0 {
    long long field_0;
    long long field_8;
    unsigned long long field_10;
} st_b09ce4_0;


long long sub_b09ce4(st_b09ce4_0 *a0, long long a1, long long *a2, long long a3, long long a4, long long a5)
{
    long long n;  // x20
    long long v3;  // w0
    long long v4;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    n = a5;
    v3 = (unsigned int)sub_a2f9e0();
    if (!v3)
        return v3;
    if (!(int)a0->field_0)
    {
        v4 = a0->field_8;
        if (v4)
        {
            if ((unsigned long long)v4 > (unsigned long long)n)
                return 0;
            a0->field_10 = a4 + n - v4;
            n -= v4;
        }
    }
    if ((unsigned long long)a3 < (unsigned long long)n)
        return 0;
    if (a1 && a4 != a1)
        _memcpy(a1, a4, n);
    *a2 = n;
    return 1;
}
