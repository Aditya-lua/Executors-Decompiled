/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf0b5c..0xaf0c20 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af0b5c(char *a0, unsigned int a1, char *a2, unsigned int a3, unsigned long long a4)
{
    char *v0;  // x10
    unsigned int v1;  // x9
    char *iter;  // x8
    unsigned long long v4;  // x3
    unsigned int v5;  // w10
    unsigned int v6;  // w9
    unsigned int v7;  // w10
    unsigned int v8;  // w9

    if (a4 >> 15 & 1)
    {
        v0 = a0;
        v1 = a1;
        if (v1 > a3)
        {
            iter = &a0[a1 + -1 * a3];
            v0 = a0;
            v1 = a1;
            do
            {
                if (!*v0 || *v0 == 46 & (unsigned int)a4 >> 4 & 1)
                    goto LABEL_af0ba8;
            } while ((v0 += 1, v1 -= 1, a3 < v1));
        }
        else
        {
LABEL_af0ba8:
            iter = v0;
            if (v1 != a3)
                goto LABEL_af0bb4;
        }
    }
    else
    {
LABEL_af0bb4:
        iter = a0;
        if (a1 != a3)
            return 0;
    }
    if (!a3)
        return 1;
    while (1)
    {
        v4 = a3;
        v5 = *iter;
        if (!v5)
            return 0;
        v6 = *a2;
        if (v5 != v6)
        {
            if (v5 - 65 < 26)
                v7 = v5 | 32;
            else
                v7 = v5 & 0xff;
            if (v6 - 65 < 26)
                v8 = v6 | 32;
            else
                v8 = v6 & 0xff;
            if (v7 != v8)
                return 0;
        }
        iter += 1;
        a2 += 1;
        a3 = v4 - 1;
        if (v4 == 1)
            return 1;
    }
}
