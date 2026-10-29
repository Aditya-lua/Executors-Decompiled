/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c755c..0x9c766c (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char ** sub_9c755c(char **a0, unsigned long long a1, unsigned int a2, unsigned int a3, char a4)
{
    char *v0;  // x8
    char v1;  // x9
    unsigned long long v10;  // x9
    unsigned int v11;  // w10
    unsigned int k;  // w10
    char *v14;  // x10
    unsigned long long node;  // x11
    char *v2;  // x8
    unsigned long long v3;  // x10
    char *iter;  // x9
    unsigned int v5;  // w11
    unsigned int i;  // w11
    unsigned long long v8;  // 4116
    unsigned long long j;  // x10

    v0 = *a0;
    v1 = a4 & 192 | (a1 != 0) * 32;
    if (30 >= (int)a3)
    {
        *v0 = v1 | (char)a3 & 31;
        v2 = v0 + 1;
        if (a1 == 2)
        {
            *v2 = 128;
            *a0 = v2 + 1;
            return a0;
        }
    }
    else
    {
        v3 = 0;
        *v0 = v1 | 31;
        iter = v0;
        v5 = a3;
        do
        {
            i = v5;
            v3 -= 1;
            iter += 1;
            v5 = i >> 7;
        } while (128 <= i);
        *iter = (char)a3 & 127;
        v8 = arm64g_calculate_condition(2, v3, 1, 0);
        if (!(v8 & 1))
        {
            j = -v3;
            do
            {
                a3 >>= 7;
                *(&v0[j] - 1) = (char)a3 | 128;
                j -= 1;
            } while (1 < (long long)j);
        }
        v2 = iter + 1;
        if (a1 == 2)
        {
            *v2 = 128;
            *a0 = v2 + 1;
            return a0;
        }
    }
    if (128 > (int)a2)
    {
        *v2 = a2;
        *a0 = v2 + 1;
        return a0;
    }
    v10 = 1;
    v11 = a2;
    do
    {
        k = v11;
        v10 += 1;
        v11 = k >> 8;
    } while (0xff < k);
    v14 = v2;
    *v14 = (char)((unsigned int)v10 - 1) | 128;
    node = v10;
    do
    {
        *(&v14[node] - 1) = a2;
        a2 >>= 8;
        node -= 1;
    } while (1 < (long long)node);
    *a0 = &v2[v10];
    return a0;
}
