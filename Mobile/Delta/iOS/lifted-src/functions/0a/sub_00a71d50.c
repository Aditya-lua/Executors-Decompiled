/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa71d50..0xa71e18 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a71d50(long long a0, long long a1, long long a2, long long n, unsigned long long a4, unsigned int a5)
{
    long long v2;  // x19
    long long v3;  // x2
    unsigned long long v4;  // x9
    char *v5;  // x8
    unsigned long long v6;  // 4106
    char *v7;  // x10
    unsigned long long v8;  // x9
    char *v9;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2;
    v3 = a1;
    v4 = n - a1;
    if ((unsigned long long)a1 > (unsigned long long)n)
    {
        _memset(a0 + n, a4, v3 - n);
    }
    else
    {
        v5 = v2 + v3;
        v6 = arm64g_calculate_condition(4, n, a1, 0);
        if (!(v6 & 1))
        {
            v7 = v5;
            do
            {
                v8 = v4;
                v9 = v7 + 1;
                if (*v7 != (unsigned int)a4)
                    goto LABEL_a71dd8;
            } while ((v4 = v8 - 1, v7 = v9, v8 != 1));
        }
        if (a5 && (*(v5 - 1) ^ (unsigned int)a4) >> 7 & 1)
        {
LABEL_a71dd8:
            sub_a368c8();
            sub_a369bc("crypto/params.c", 155, "copy_integer");
            sub_a36abc(15, 126, 0);
            return 0;
        }
        n = v3;
    }
    _memcpy(a0, v2, n);
    return 1;
}
