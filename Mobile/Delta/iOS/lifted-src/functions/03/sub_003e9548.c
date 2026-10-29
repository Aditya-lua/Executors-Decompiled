/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e9548..0x3e963c (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_3e9548(char *a0, unsigned int a1)
{
    unsigned long v0;  // cc_dep1
    char v1;  // x10
    unsigned int v10;  // w10
    unsigned long long v2;  // 4108
    unsigned long long v3;  // 4108
    char *v4;  // x9
    unsigned long long v5;  // x10
    unsigned int v6;  // w10
    unsigned int v7;  // w9
    unsigned int v8;  // w9
    unsigned int v9;  // w8

    v0 = a1 & 0x80000000;
    if (!(a1 & 0x80000000))
    {
        v1 = 43;
        v2 = arm64g_calculate_condition(9, v0, 0, 0);
        if (!(v2 & 1))
            goto LABEL_3e9572;
LABEL_3e9571:
    }
    else
    {
        v1 = 45;
        v3 = arm64g_calculate_condition(9, v0, 0, 0);
        if (v3 & 1)
            goto LABEL_3e9571;
LABEL_3e9572:
        a1 = (a1 + 1 + ~a1 * 2 | 1) + (a1 + 1 & 1);
    }
    *a0 = v1;
    if (9 >= a1)
    {
        v4 = a0 + 2;
        a0[1] = 48;
        v5 = 3;
    }
    else if (99 >= a1)
    {
        v6 = 205 * (a1 & 0xff) >> 11;
        v7 = (v6 * 2 + 2 & 96) + (v6 + 1 ^ 48);
        v4 = a0 + 2;
        a0[1] = (char)~v7 + (char)v7 * 2;
        a1 -= 10 * v6;
        v5 = 3;
    }
    else
    {
        v8 = a1 / 100;
        a0[1] = (char)v8 + 48;
        v9 = a1 - 100 * v8;
        v10 = 205 * (v9 & 0xff) >> 11;
        v4 = a0 + 3;
        a0[2] = (char)v10 | 48;
        a1 = v9 - 10 * v10;
        v5 = 4;
    }
    *v4 = (char)a1 | 48;
    return &a0[v5];
}
