/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa012ac..0xa013f0 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a012ac(long long a0, long long *a1, long long a2, int a3)
{
    unsigned long long v4;  // x23
    unsigned long long v5;  // x22
    unsigned long long v6;  // x24
    unsigned long long v7;  // x0
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!a1[1])
    {
        v4 = 0;
        if (a3 == 2)
            goto LABEL_a012f4;
        goto LABEL_a01344;
    }
    v4 = sub_9ffc20(a1);
    switch (a3)
    {
    case 2:
LABEL_a012f4:
        v5 = a1[13];
        v6 = a1[14];
        if (a1[14])
        {
            v7 = sub_9d4cf4(a0, a2, 128);
            if (!(unsigned int)v7)
                return v7;
            v0 = "Private-Key";
            v1 = v4;
            if (1 > (int)sub_9d524c(a0, "%s: (%d bit)\n"))
                return 0;
            goto LABEL_a01378;
        }
        break;
    case 0:
LABEL_a01344:
        v5 = 0;
        break;
    default:
LABEL_a01344:
        v5 = a1[13];
        break;
    }
    v0 = v4;
    if ((int)sub_9d524c(a0, "Public-Key: (%d bit)\n") < 1)
        return 0;
    v6 = 0;
LABEL_a01378:
    v8 = sub_9cab08(a0, "priv:", v6, 0, a2);
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_9cab08(a0, "pub: ", v5, 0, a2);
    if (!(unsigned int)v9)
        return v9;
    return sub_a61364(a0, a1 + 1, a2) != 0;
}
