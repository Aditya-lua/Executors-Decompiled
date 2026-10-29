/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9771bc..0x977244 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char sub_9771bc(void* a0, char a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    char v8;  // w0
    unsigned long v9;  // cc_dep1
    unsigned long long v10;  // x8
    unsigned long long v11;  // 4106
    unsigned long long v12;  // 4106
    char v13;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if ((char)a0[1568] & 7)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a1 && sub_717b8(a1))
    {
        v8 = sub_9d34b4(a0 + 104, a1);
        v9 = v8;
        if (v8)
        {
            v10 = (long long)a0[1568] | 0x8000000000;
            v11 = arm64g_calculate_condition(19, v9, 0, 0);
            if (!(v11 & 1))
                goto LABEL_97721a;
LABEL_977219:
            v13 = 1;
        }
        else
        {
            v10 = (long long)a0[1568] & 0xffffff7fffffffff;
            v12 = arm64g_calculate_condition(19, v9, 0, 0);
            if (v12 & 1)
                goto LABEL_977219;
LABEL_97721a:
            v13 = 0;
        }
    }
    else
    {
        sub_9d353c(a0 + 104);
        v10 = (long long)a0[1568] & 0xffffff7fffffffff;
        v13 = 1;
    }
    *(unsigned long long *)&a0[1568] = v10;
    return v13;
}
