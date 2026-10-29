/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e0514..0x9e0578 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e0514_0 {
    unsigned long long field_0;
} st_9e0514_0;


unsigned long long sub_9e0514(st_9e0514_0 **a0, unsigned long long a1)
{
    unsigned long long v0;  // w10
    unsigned long long v1;  // 4112
    int v2;  // w8
    unsigned long long *v3;  // x10
    unsigned long long v4;  // w11
    unsigned long long v5;  // x0

    if (a1 < 0)
        v0 = a1 + 63;
    else
        v0 = a1;
    v1 = arm64g_calculate_condition(177, a1, 63, 0);
    if (!(v1 & 1))
    {
        v2 = (long long)(v0) >> 6;
        if ((int)a0[1] > v2)
        {
            v3 = *a0;
            v4 = a1 - (v0 & 0xffffffc0);
            if (!v4)
                return v3[v2];
            v5 = v3[v2] >> ((char)v4 & 63);
            if ((int)a0[1] <= v2 + 1)
                return v5;
            return v3[1 + v2] << ((char)-v4 & 63) | v5;
        }
    }
    return 0;
}
