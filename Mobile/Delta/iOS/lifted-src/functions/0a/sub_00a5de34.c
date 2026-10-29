/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5de34..0xa5df54 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_a5de34(unsigned int *a0)
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
    if (v2 >> 11 & 1 && (v3 = a0, v4 = v3 + 10, *(long long *)&v3[10] && *(long long *)(*(long long *)&v3[10] + 96)))
    {
        sub_9ffdd0();
        v5 = 96;
    }
    else if ((unsigned int)v2 & 49648 && (v6 = a0, v4 = v6 + 10, *(long long *)&v6[10] && *(long long *)(*(long long *)&v6[10] + 248)))
    {
        sub_9ffdd0();
        v5 = 248;
    }
    else if ((unsigned int)v2 & 0x600 && (v7 = a0, v4 = v7 + 10, *(long long *)&v7[10] && *(long long *)(*(long long *)&v7[10] + 120)))
    {
        sub_9ffdd0();
        goto LABEL_a5df14;
    }
    else if ((unsigned int)v2 & 6 && !(v8 = a0, v4 = v8 + 8, !*(long long *)&v8[8] || !*(long long *)(*(long long *)&v8[8] + 0x88)))
    {
        sub_975ff4();
        v5 = 0x88;
    }
    else
    {
        if (!((unsigned int)v2 & 0x3000))
            return 0;
        v9 = a0;
        v4 = v9 + 10;
        if (!*(long long *)&v9[10])
        {
            return 0;
        }
        else if (*(long long *)(*(long long *)&v9[10] + 120))
        {
            sub_9ffdd0();
        }
        else
        {
            return 0;
        }
LABEL_a5df14:
        v5 = 120;
    }
    sub_a79f54();
    goto *((void *)(*(long long *)(*(long long *)v4 + v5)));
}
