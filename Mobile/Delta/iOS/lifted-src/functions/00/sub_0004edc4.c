/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4edc4..0x4ee60 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char _NSHomeDirectory;

unsigned long long sub_4edc4(unsigned int a0, char *a1, unsigned long a2)
{
    unsigned long long v0;  // x0

    v0 = a0 & 127;
    if ((unsigned int)v0 != 127 && a2)
    {
        v0 = (unsigned int)v0 - *a1 * ((a0 * &_NSHomeDirectory | a0 >> 8) & 0xff00007f & 127);
        if (a2 != 1)
        {
            v0 = (unsigned int)v0 - a1[1] * ((a0 * 0x10000 | a0 >> 16) & 0xffff007f & 127);
            if (a2 != 2)
            {
                v0 = (unsigned int)v0 - a1[2] * ((a0 * 0x100 | a0 >> 24) & 0xffffff7f & 127);
                if (a2 != 3)
                {
                    v0 = (unsigned int)v0 - a1[3] * (a0 * 0 & 127);
                    if (a2 != 4)
                    {
                        v0 = (unsigned int)v0 - a1[4] * (a0 * &_NSHomeDirectory & 0xff00007f & 127);
                        if (a2 != 5)
                        {
                            v0 = (unsigned int)v0 - a1[5] * (a0 * 0x10000 & 0xffff007f & 127);
                            if (a2 != 6)
                                v0 = (unsigned int)v0 - a1[6] * (a0 * 0x100 & 0xffffff7f & 127);
                        }
                    }
                }
            }
        }
    }
    return v0;
}
