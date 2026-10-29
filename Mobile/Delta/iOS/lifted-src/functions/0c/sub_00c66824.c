/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc66824..0xc668d8 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c66824(long long *a0, unsigned int a1, unsigned long a2, unsigned int *a3)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    switch (a1)
    {
    case 10:
        return sub_a19928(sub_a59bc4(), 4, a3, 0);
    case 9:
        if (!*(int *)a0 || a0[12])
            return 0;
        sub_a59bc4();
        break;
        return 0;
    case 3:
        if (sub_9c7b68() == 1172)
        {
            *a3 = 1143;
            return 2;
        }
        *a3 = 672;
        return 1;
    default:
        return 0xfffffffe;
    }
}
