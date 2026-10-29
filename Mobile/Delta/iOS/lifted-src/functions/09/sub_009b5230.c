/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b5230..0x9b52c8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b5230_0 {
    char padding_0[172];
    int field_ac;
    char padding_b0[2328];
    unsigned long long field_9c8;
} st_9b5230_0;


unsigned long long sub_9b5230(st_9b5230_0 *a0)
{
    int v0;  // w8
    unsigned long long v1;  // x10
    unsigned long long v2;  // x9
    unsigned long long v3;  // x10
    unsigned long long v4;  // x10
    unsigned long long v5;  // x11

    v0 = a0->field_ac;
    if (33 < v0)
    {
        v2 = 64;
        v3 = 1;
        if (v0 != 48)
            v3 = 0;
        if (v0 == 36)
            v3 = v2;
        v4 = 0x202;
        v5 = 1;
        if (v0 != 35)
            v5 = 0;
        if (v0 == 0x22)
            v5 = v4;
        if (35 >= v0)
            return v5;
        return v3;
    }
    else if (31 < v0)
    {
        v1 = "RL\"";
        if (v0 != 33)
            v1 = 0;
        if (v0 != 32)
            return v1;
        return 0x800;
    }
    else if (2 > (unsigned int)(v0 - 30))
    {
        return a0->field_9c8;
    }
    else if (v0 == 22)
    {
        return 131396;
    }
    else
    {
        return 0;
    }
}
