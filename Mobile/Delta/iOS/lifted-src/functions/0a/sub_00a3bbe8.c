/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3bbe8..0xa3bce0 (248 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a3bbe8(char *a0, char *a1)
{
    long long v2;  // x1
    char *v3;  // x19
    long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 - 7 >= 2)
    {
        switch (a0)
        {
        case 4:
            if (!a1)
                return 1;
            if (*(int *)a1 != 1)
            {
                v2 = 786691;
                if (*(long long *)&a1[40] && *(int *)&a1[48])
                    goto LABEL_a3bc8c;
                v3 = 0;
                v4 = 329;
                break;
            }
            else
            {
                v3 = 0xfffffffe;
                v2 = 147;
                v4 = 324;
                break;
            }
        case 1:
            if (a1)
            {
                v2 = 786691;
                if (*(long long *)&a1[40] && *(int *)&a1[48])
                    goto LABEL_a3bc8c;
                v3 = 0xffffffff;
                v4 = 311;
                break;
            }
            else
            {
                v3 = 0xfffffffe;
                v2 = 147;
                v4 = 306;
                break;
            }
        default:
LABEL_a3bc8c:
            return 1;
        }
    }
    else if (a1)
    {
        v2 = 786691;
        if (*(int *)&a1[16] && *(int *)&a1[48])
            goto LABEL_a3bc8c;
        v3 = 0xffffffff;
        v4 = 342;
    }
    else
    {
        v3 = 0xfffffffe;
        v2 = 147;
        v4 = 337;
    }
    sub_c67220(v4, v2);
    return v3;
}
