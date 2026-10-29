/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2b1a0..0xa2b264 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2b1a0_0 {
    char padding_0[8];
    struct st_a2b1a0_1 *field_8;
    char padding_10[16];
    unsigned long long field_20;
} st_a2b1a0_0;

typedef struct st_a2b1a0_1 {
    unsigned int field_0;
} st_a2b1a0_1;


int sub_a2b1a0(st_a2b1a0_0 *a0, unsigned long a1, unsigned long long *a2)
{
    unsigned int v3;  // w8
    unsigned long long v4;  // x11
    unsigned long long v5;  // x12
    unsigned long long v6;  // x30
    unsigned long long v7;  // x11
    unsigned int v8;  // w9
    unsigned long long v9;  // x8
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (!a1)
    {
        v8 = *(int *)a0->field_8;
        v9 = 32;
        switch (v8)
        {
        case 1034: case 1087:
            break;
        case 1035:
            v9 = 56;
            break;
        default:
            v9 = 56;
            v9 = 57;
            break;
        }
        *a2 = v9;
        return 1;
    }
    else if (a0->field_20)
    {
        v3 = *(int *)a0->field_8;
        v4 = 32;
        v5 = 56;
        if (v3 != 1035)
            v5 = 57;
        if (v3 == 1087)
            v5 = v4;
        if (v3 == 1034)
            v5 = v4;
        if (v5 > *a2)
            return 0;
        v0 = &v2;
        v1 = v6;
        v7 = 56;
        if (v3 != 1035)
            v7 = 57;
        if (v3 == 1087)
            v7 = 32;
        if (v3 == 1034)
            v7 = 32;
        *a2 = v7;
        _memcpy();
        return 1;
    }
    else
    {
        return 0;
    }
}
