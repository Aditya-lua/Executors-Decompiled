/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5dd14..0xa5de34 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5dd14(unsigned int *a0)
{
    unsigned long v2;  // x8
    unsigned int *v3;  // x20
    unsigned long v4;  // x20
    unsigned long long v5;  // x22
    unsigned int *v6;  // x20
    unsigned int *v7;  // x20
    unsigned int *v8;  // x20
    unsigned int *v9;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a0;
    if (v2 >> 11 & 1 && (v3 = a0, v4 = v3 + 10, *(long long *)&v3[10] && *(long long *)(*(long long *)&v3[10] + 112)))
    {
        sub_9ffdd0();
        v5 = 112;
    }
    else if ((unsigned int)v2 & 49648 && (v6 = a0, v4 = v6 + 10, *(long long *)&v6[10] && *(long long *)(*(long long *)&v6[10] + 232)))
    {
        sub_9ffdd0();
        v5 = 232;
    }
    else if ((unsigned int)v2 & 0x600 && (v7 = a0, v4 = v7 + 10, *(long long *)&v7[10] && *(long long *)(*(long long *)&v7[10] + 104)))
    {
        sub_9ffdd0();
        goto LABEL_a5ddc8;
    }
    else if ((unsigned int)v2 & 0x3000 && !(v8 = a0, v4 = v8 + 10, !*(long long *)&v8[10] || !*(long long *)(*(long long *)&v8[10] + 104)))
    {
        sub_9ffdd0();
LABEL_a5ddc8:
        v5 = 104;
    }
    else if ((unsigned int)v2 & 6)
    {
        v9 = a0;
        v4 = v9 + 8;
        if (!*(long long *)&v9[8])
        {
            return 0;
        }
        else if (*(long long *)(*(long long *)&v9[8] + 120))
        {
            sub_975ff4();
            v5 = 120;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        return 0;
    }
    sub_a79f54();
    goto *((void *)(*(long long *)(*(long long *)v4 + v5)));
}
